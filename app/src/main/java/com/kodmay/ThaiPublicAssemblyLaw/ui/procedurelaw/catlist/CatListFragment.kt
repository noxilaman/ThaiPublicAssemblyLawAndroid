package com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist

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
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData
import com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.LawDetailActivity
import com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener
import com.kodmay.ThaiPublicAssemblyLaw.ui.main.MainActivity
import com.kodmay.ThaiPublicAssemblyLaw.view.DividerItemDecoration
import kotlinx.android.synthetic.main.fragment_cat_list.*
import org.jetbrains.anko.support.v4.startActivity


class CatListFragment : Fragment(), CatListAdapter.CatListener, MainActivity.PagerFragmentListener {

    val mContext: Context by lazy { Contextor.getInstance().context }
    var isLawList = false
    var catStack = mutableListOf<List<CatData>>()

    override fun onBackPressed() {
        //do nothing
    }

    private var listener: FragmentInteractionListener? = null
    private lateinit var catDataList: List<CatData>
    private lateinit var catAdapter: CatListAdapter
    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            catDataList = it.getParcelableArrayList("data")!!
            isLawList = it.getBoolean("isLawList")
        }

    }

    override fun onResume() {
        super.onResume()
        loading?.visibility = View.GONE
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cat_list, container, false)
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

        //loading?.visibility = View.VISIBLE
        catStack.add(catDataList)
        catAdapter = CatListAdapter(catDataList, this)
        list.layoutManager = LinearLayoutManager(context)
        list.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL_LIST))
        list.adapter = catAdapter

        edt_search.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(text: Editable?) {
                filterSearch(text.toString())
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

    }

    private fun filterSearch(text: CharSequence) {
        var catItemList = catAdapter.getData().filter { text.isEmpty() || it.c_name.contains(text) }
        catAdapter.updateData(catItemList)
    }

    override fun onSelectCat(catData: CatData) {
        loading?.visibility = View.VISIBLE
        if (isLawList) {
            openDetail(catData.i_id)
        } else if (catData.c_law_code != null && !catData.c_law_code!!.isBlank()) {
            LawRepository.getInstance()
                .loadLawDataByCat(catData.i_id, lawPref.appId, object : HttpCallback<LawByCatResponse> {
                    override fun onSuccess(data: LawByCatResponse) {
                        loading?.visibility = View.GONE
                        listener?.onTitleChange(catData.c_name,true)
                        isLawList = true
                        catStack.add(data.dataList)
                        openSubCat(data.dataList)
                    }

                    override fun onFailure(error: String) {
                        loading?.visibility = View.GONE
                    }
                })
        } else {
            LawRepository.getInstance()
                .loadCatLawItem(catData.i_id, lawPref.appId, object : HttpCallback<LawByCatResponse> {
                    override fun onSuccess(data: LawByCatResponse) {
                        loading?.visibility = View.GONE
                        listener?.onTitleChange(catData.c_name,true)
                        catStack.add(data.dataList)
                        openSubCat(data.dataList)
                    }

                    override fun onFailure(error: String) {
                        loading?.visibility = View.GONE
                    }
                })
        }

    }

    private fun openSubCat(dataList: ArrayList<CatData>) {
        catAdapter.updateData(dataList)
    }

    private fun openDetail(id: Int) {
        startActivity<LawDetailActivity>("id" to id)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentInteractionListener) {
            listener = context
            //listener?.onTitleChange(context.getString(R.string.tab_2))
            listener?.showBackButton(true)
        } else {
            throw RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener")
        }
        //val mainAct = activity as MainActivity
        //mainAct.pageListener = this
    }

    override fun onDetach() {
        super.onDetach()
        listener?.showBackButton(false)
        listener?.onTitleChange(mContext.getString(R.string.app_name_space),false)
        listener = null
    }

    fun popupBackStack(): Boolean = if (catStack.size > 1) {
        catStack.remove(catStack.last())
        catAdapter.updateData(catStack.last())
        listener?.popupTitleBackStack()
        isLawList = false
        true
    }else{
        false
    }

    companion object {
        @JvmStatic
        fun newInstance(catDataList: ArrayList<CatData>, isLawList: Boolean) =
            CatListFragment().apply {
                arguments = Bundle().apply {
                    putParcelableArrayList("data", catDataList)
                    putBoolean("isLawList", isLawList)
                }
            }
    }
}

interface ListListener {
    fun onCatSelect(catData: CatData)
    fun onLawSelect(lawData: LawData)
}