package com.kodmay.ThaiPublicAssemblyLaw.ui.dekadetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat

import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaData
import kotlinx.android.synthetic.main.fragment_deka_detail.*

private const val DEKA_DATA = "deka_data"

class DekaDetailFragment : Fragment() {
    private lateinit var deka: DekaData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            deka = it.getParcelable(DEKA_DATA)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deka_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_title.text = deka.c_name
        tv_desc.text = HtmlCompat.fromHtml(deka.c_desc, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }

    companion object {

        @JvmStatic
        fun newInstance(dekaData: DekaData) =
            DekaDetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(DEKA_DATA, dekaData)
                }
            }
    }
}
