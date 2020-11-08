package com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark

import android.os.Bundle
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
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkResponse
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData
import com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.LawDetailActivity
import com.kodmay.ThaiPublicAssemblyLaw.view.DividerItemDecoration
import kotlinx.android.synthetic.main.fragment_bookmark_list.*
import org.jetbrains.anko.noButton
import org.jetbrains.anko.support.v4.alert
import org.jetbrains.anko.support.v4.startActivity
import org.jetbrains.anko.support.v4.toast
import org.jetbrains.anko.yesButton

class BookmarkFragment : Fragment(), HttpCallback<BookmarkResponse>, BookmarkAdapter.OnListFragmentInteractionListener {

    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bookmark_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL_LIST))
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
    }

    override fun onSuccess(data: BookmarkResponse) {
        list.adapter = BookmarkAdapter(data.dataList,this)
    }

    override fun onFailure(error: String) {
        toast(error).show()
    }

    override fun onListFragmentInteraction(item: LawData) {
        startActivity<LawDetailActivity>("id" to item.i_id, "bookmark" to true)
    }

    override fun onDelete(item: LawData) {
        alert("ต้องการลบ Bookmark นี้หรือไม่"){
            yesButton {
                LawRepository.getInstance().deleteBookmark(item.i_id, object: HttpCallback<AddBookmarkResponse>{
                    override fun onSuccess(data: AddBookmarkResponse) {
                        LawRepository.getInstance().loadBookmark(this@BookmarkFragment)
                    }

                    override fun onFailure(error: String) {
                        toast(error).show()
                    }
                })
            }
            noButton { it.dismiss() }
        }.show()
    }

    fun loadData() {
        if(lawPref.userId > 0) {
            LawRepository.getInstance().loadBookmark(this)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            BookmarkFragment()
    }
}
