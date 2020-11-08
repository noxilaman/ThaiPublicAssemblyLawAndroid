package com.kodmay.ThaiPublicAssemblyLaw.ui.home

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat

import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.AppDatabase
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData
import com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private var listener: FragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        context?.let {context ->
            loading?.visibility = View.VISIBLE

            Flowable.fromCallable { AppDatabase.getAppDatabase(context).appDataDao().getAppDataCount().blockingGet() }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    if (it > 0) {
                        Flowable.fromCallable { AppDatabase.getAppDatabase(context).appDataDao().getAppData().blockingFirst() }
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe {data ->
                                updateUI(data.first())
                            }
                    }
                }

        }
    }

    fun updateUI(appDetail: AppData) {
        loading.visibility = View.GONE
        detail.text = HtmlCompat.fromHtml(appDetail.app_desc,HtmlCompat.FROM_HTML_MODE_LEGACY);

    }

    /*override fun onFailure(error: String) {
        loading.visibility = View.GONE
        listener?.onShowSnackBar(error)
    }*/

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentInteractionListener) {
            listener = context
            listener?.onTitleChange(context.getString(R.string.tab_home),false)
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
