package com.kodmay.ThaiPublicAssemblyLaw.ui.appstore

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppListResponse
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppStoreData
import com.kodmay.ThaiPublicAssemblyLaw.view.DividerItemDecoration
import kotlinx.android.synthetic.main.fragment_appstore_list.*
import android.content.Intent
import android.net.Uri


class AppStoreFragment : Fragment(), HttpCallback<AppListResponse> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_appstore_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LawRepository.getInstance().loadAppStoreList(this)
    }

    override fun onSuccess(data: AppListResponse) {
        val adapter = MyAppStoreAdapter(data.dataList, object : OnListFragmentInteractionListener {
            override fun onListFragmentInteraction(item: AppStoreData) {

                try {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=${item.android_id}")))
                } catch (anfe: android.content.ActivityNotFoundException) {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=${item.android_id}")
                        )
                    )
                }

            }
        })
        list.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL_LIST))
        list.adapter = adapter

    }

    override fun onFailure(error: String) {

    }


    interface OnListFragmentInteractionListener {
        fun onListFragmentInteraction(item: AppStoreData)
    }

    companion object {

        @JvmStatic
        fun newInstance() = AppStoreFragment()
    }
}
