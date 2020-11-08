package com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.avalue.phsc.data.preferences.LawPrefs
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor
import com.kodmay.ThaiPublicAssemblyLaw.repository.AppDatabase
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData
import com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.LawDetailActivity
import com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener
import com.kodmay.ThaiPublicAssemblyLaw.ui.main.MainActivity
import com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist.CatListFragment
import com.kodmay.ThaiPublicAssemblyLaw.view.DividerItemDecoration
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_home.loading
import kotlinx.android.synthetic.main.fragment_law_list.edt_search
import kotlinx.android.synthetic.main.fragment_law_list.list
import org.jetbrains.anko.support.v4.startActivity


class LawListFragment : Fragment(), ListListener, MainActivity.PagerFragmentListener {
    override fun onBackPressed() {
        if (childFragmentManager.backStackEntryCount>0){
            if (catListFragment!=null && !catListFragment!!.popupBackStack()) {
                childFragmentManager.popBackStack()
            }
        }else{
            listener?.onBack()
        }
    }

    private var listener: FragmentInteractionListener? = null
    private lateinit var lawDataList: List<LawData>
    private lateinit var catDataList: List<CatData>
    private val lawAdapter = SectionedRecyclerViewAdapter()
    val mContext: Context by lazy { Contextor.getInstance().context }
    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }
    private var catListFragment: CatListFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_law_list, container, false)
        // Set the adapter
        if (view is RecyclerView) {

            with(view) {
                layoutManager = LinearLayoutManager(context)
            }
        }
        return view
    }

    @SuppressLint("CheckResult")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        loading?.visibility = View.VISIBLE
        lawAdapter.removeAllSections()

        Flowable.fromCallable { AppDatabase.getAppDatabase(mContext).lawDataDao().getLawData().blockingFirst() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { lawList ->
                lawDataList = lawList

                Flowable.fromCallable { AppDatabase.getAppDatabase(mContext).lawCatDao().getCatData().blockingFirst() }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { catList ->
                        catDataList = catList


                        // set catList
                        var catItemList = catDataList.map { catData -> LawListData(catData.c_name, true, catData, catData.i_id) }
                        var lawItemList = lawDataList.map { lawData -> LawListData(lawData.c_name, false, null, lawData.i_id) }

                        lawAdapter.addSection(LawSection(mContext.getString(R.string.law_by_cat), catItemList, this))
                        lawAdapter.addSection(LawSection(mContext.getString(R.string.law_by_statute), lawItemList, this))
                        list.layoutManager = LinearLayoutManager(context)
                        list.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL_LIST))
                        list.adapter = lawAdapter

                        edt_search.addTextChangedListener(object :TextWatcher{
                            override fun afterTextChanged(text: Editable?) {
                                filterSearch(text.toString())
                            }

                            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            }

                            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            }
                        })
                    }
            }



    }

    private fun filterSearch(text: CharSequence) {
        var catItemList = catDataList.filter { text.isEmpty() || it.c_name.contains(text) || (it.c_desc!=null && it.c_desc.contains(text)) }.map { catData -> LawListData(catData.c_name, true, catData, catData.i_id) }
        var lawItemList = lawDataList.filter { text.isEmpty() || it.c_name.contains(text) || (it.c_desc!=null && it.c_desc.contains(text)) }.map { lawData -> LawListData(lawData.c_name, false, null, lawData.i_id) }
        lawAdapter.removeAllSections()
        lawAdapter.addSection(LawSection(mContext.getString(R.string.law_by_cat), catItemList, this))
        lawAdapter.addSection(LawSection(mContext.getString(R.string.law_by_statute), lawItemList, this))
        lawAdapter.notifyDataSetChanged()
    }

    override fun onCatSelect(catData: CatData) {
        loading?.visibility = View.VISIBLE
        if (catData.c_law_code.isNullOrBlank()) {
            LawRepository.getInstance()
                .loadCatLawItem(catData.i_id, lawPref.appId, object : HttpCallback<LawByCatResponse> {
                    override fun onSuccess(data: LawByCatResponse) {
                        loading?.visibility = View.GONE
                        if (data.dataList.isEmpty()) {
                            openDetail(catData.i_id)
                        } else {
                            listener?.onTitleChange(catData.c_name, true)
                            openSubCat(data.dataList, false)
                        }
                    }

                    override fun onFailure(error: String) {
                        listener?.onShowSnackBar(error)
                        loading?.visibility = View.GONE
                    }
                })
        }else{
            LawRepository.getInstance()
                .loadLawDataByCat(catData.i_id, lawPref.appId, object : HttpCallback<LawByCatResponse> {
                    override fun onSuccess(data: LawByCatResponse) {
                        loading?.visibility = View.GONE
                        listener?.onTitleChange(catData.c_name,true)
                        openSubCat(data.dataList, true)
                    }

                    override fun onFailure(error: String) {
                        loading?.visibility = View.GONE
                    }
                })
        }
    }

    override fun onLawSelect(lawId: Int) {
        openDetail(lawId)
    }

    private fun openSubCat(catList: ArrayList<CatData>, isLawList: Boolean) {
        catListFragment = CatListFragment.newInstance(catList, isLawList)
        childFragmentManager.beginTransaction().replace(R.id.root, catListFragment!!).addToBackStack("cat").commit()
    }

    private fun openDetail(id: Int) {
        startActivity<LawDetailActivity>("id" to id)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentInteractionListener) {
            listener = context
            listener?.onTitleChange(context.getString(R.string.app_name_space),false)
        } else {
            throw RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener")
        }
        val mainAct = activity as MainActivity
        mainAct.pageListener = this
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            LawListFragment()
    }
}

interface ListListener{
    fun onCatSelect(catData: CatData)
    fun onLawSelect(lawId: Int)
}