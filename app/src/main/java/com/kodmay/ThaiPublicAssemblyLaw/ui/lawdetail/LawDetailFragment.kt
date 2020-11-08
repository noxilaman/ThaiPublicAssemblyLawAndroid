package com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail

import android.content.Context
import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import kotlinx.android.synthetic.main.fragment_law_detail.*
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener
import com.kodmay.ThaiPublicAssemblyLaw.view.MarginItemHeightDecoration
import org.jetbrains.anko.dimen
import org.jetbrains.anko.support.v4.share
import android.view.ViewParent
import android.graphics.Point
import androidx.core.widget.NestedScrollView
import com.avalue.phsc.data.preferences.LawPrefs
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.*
import com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkNoteActivity
import com.kodmay.ThaiPublicAssemblyLaw.ui.dekadetail.DekaDetailFragment
import com.kodmay.ThaiPublicAssemblyLaw.ui.login.LoginActivity
import org.jetbrains.anko.okButton
import org.jetbrains.anko.support.v4.alert
import org.jetbrains.anko.support.v4.startActivity
import org.jetbrains.anko.support.v4.toast


private const val LAW_ID = "id"
private const val BOOKMARK_MODE = "bookmark_mode"

class LawDetailFragment : Fragment(), HttpCallback<List<LawData>> {

    private lateinit var adapter: DekaListAdapter
    private var note: String = ""
    private var pageIndex: Int = 0
    private var lawId: Int = 0
    private var bookmarkMode: Boolean = false
    private var listener: FragmentInteractionListener? = null
    private lateinit var lawList: List<LawData>
    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            lawId = it.getInt(LAW_ID)
            bookmarkMode = it.getBoolean(BOOKMARK_MODE)
        }

        adapter = DekaListAdapter(mutableListOf(), object : DekaListAdapter.DekaListener {
            override fun onSelectDeka(dekaData: DekaData) {
                activity?.let {
                    it.supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, DekaDetailFragment.newInstance(dekaData))
                        .addToBackStack("dekaDetail")
                        .commit()
                }

            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_law_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (bookmarkMode) {
            LawRepository.getInstance().loadBookmark(object : HttpCallback<BookmarkResponse> {
                override fun onSuccess(data: BookmarkResponse) {
                    lawList = data.dataList
                    pageIndex = lawList.indexOf(lawList.find { it.i_id == lawId })
                    renderPage()
                }

                override fun onFailure(error: String) {
                    toast(error).show()
                }
            })
        } else {
            LawRepository.getInstance().loadCacheLaw(this)
        }

        list.addItemDecoration(MarginItemHeightDecoration(list.context.dimen(R.dimen.list_deka_margin)))
        list.layoutManager = LinearLayoutManager(context)
        list.adapter = adapter

        img_font_down.setOnClickListener {
            val textSize = tv_desc.textSize
            if (textSize > tv_desc.context.dimen(R.dimen.minFontSize)) {
                val newTextSize = textSize - tv_desc.context.dimen(R.dimen.stepFontSize)
                tv_desc.setTextSize(TypedValue.COMPLEX_UNIT_PX, newTextSize)
            }
        }

        img_font_up.setOnClickListener {
            val textSize = tv_desc.textSize
            if (textSize < tv_desc.context.dimen(R.dimen.maxFontSize)) {
                val newTextSize = textSize + tv_desc.context.dimen(R.dimen.stepFontSize)
                tv_desc.setTextSize(TypedValue.COMPLEX_UNIT_PX, newTextSize)
            }
        }

        img_left.setOnClickListener {
            if (pageIndex > 0) {
                pageIndex--
                renderPage()
            }
        }

        img_right.setOnClickListener {
            if (pageIndex < lawList.size - 1) {
                pageIndex++
                renderPage()
            }
        }

        img_share.setOnClickListener {
            lawList[pageIndex].c_desc?.let {
                share(HtmlCompat.fromHtml(it, HtmlCompat.FROM_HTML_MODE_LEGACY).toString(), lawList[pageIndex].c_name)
            }
        }

        img_hummer.setOnClickListener {
            scrollToView(scrollView, list)
        }

        if (bookmarkMode) {
            img_bookmark.setImageResource(R.drawable.compose_3x)
            img_bookmark.setOnClickListener {
                startActivity<BookmarkNoteActivity>("lawId" to lawId, "note" to note)
            }
        } else {

            img_bookmark.setOnClickListener {
                if (lawPref.userId == 0) {
                    startActivity<LoginActivity>()
                } else {
                    LawRepository.getInstance().addBookmark(lawId, object : HttpCallback<AddBookmarkResponse> {
                        override fun onSuccess(data: AddBookmarkResponse) {
                            alert("เพิ่มไปยัง Bookmark แล้ว") { okButton { it.dismiss() } }.show()
                        }

                        override fun onFailure(error: String) {
                            toast(error).show()
                        }
                    })
                }
            }
        }
    }

    override fun onSuccess(dataList: List<LawData>) {
        lawList = dataList
        pageIndex = lawList.indexOf(lawList.find { it.i_id == lawId })
        renderPage()
    }

    private fun renderPage() {
        lawList[pageIndex].c_desc?.let {
            listener?.onTitleChange(lawList[pageIndex].c_name, false)
            tv_desc.text = HtmlCompat.fromHtml(it, HtmlCompat.FROM_HTML_MODE_LEGACY)
        }

        adapter.clear()
        li_note.visibility = View.GONE

        LawRepository.getInstance().loadDekaByLawId(lawList[pageIndex].i_id, object : HttpCallback<DekaLawResponse> {

            override fun onSuccess(data: DekaLawResponse) {
                renderDeka(data.dataList.sortedBy { it.i_no })
            }

            override fun onFailure(error: String) {

            }
        })

        if (bookmarkMode) {
            renderNote(lawList[pageIndex])
        } else {
            LawRepository.getInstance()
                .loadBookmarkNote(lawList[pageIndex].i_id, object : HttpCallback<BookmarkNoteResponse> {
                    override fun onSuccess(data: BookmarkNoteResponse) {
                        renderNote(data.dataList.first())
                    }

                    override fun onFailure(error: String) {

                    }
                })
        }
    }

    private fun renderNote(noteData: LawData) {
        note = ""
        noteData.note?.let {
            note = noteData.note
            if (!note.isBlank()) {
                li_note.visibility = View.VISIBLE
                tv_note.text = noteData.note
            }
        }
    }

    private fun renderDeka(dataList: List<DekaData>) {
        adapter.updateData(dataList)
    }

    override fun onFailure(error: String) {
        //no response [query from sqlite]
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * Used to scroll to the given view.
     *
     * @param scrollViewParent Parent ScrollView
     * @param view View to which we need to scroll.
     */
    private fun scrollToView(scrollViewParent: NestedScrollView, view: View) {
        // Get deepChild Offset
        val childOffset = Point()
        getDeepChildOffset(scrollViewParent, view.parent, view, childOffset)
        // Scroll to child.
        scrollViewParent.smoothScrollTo(0, childOffset.y)
    }

    /**
     * Used to get deep child offset.
     *
     *
     * 1. We need to scroll to child in scrollview, but the child may not the direct child to scrollview.
     * 2. So to get correct child position to scroll, we need to iterate through all of its parent views till the main parent.
     *
     * @param mainParent        Main Top parent.
     * @param parent            Parent.
     * @param child             Child.
     * @param accumulatedOffset Accumulated Offset.
     */
    private fun getDeepChildOffset(mainParent: ViewGroup, parent: ViewParent, child: View, accumulatedOffset: Point) {
        val parentGroup = parent as ViewGroup
        accumulatedOffset.x += child.left
        accumulatedOffset.y += child.top
        if (parentGroup == mainParent) {
            return
        }
        getDeepChildOffset(mainParent, parentGroup.parent, parentGroup, accumulatedOffset)
    }

    companion object {

        @JvmStatic
        fun newInstance(id: Int, bookmarkMode: Boolean) =
            LawDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(LAW_ID, id)
                    putBoolean(BOOKMARK_MODE, bookmarkMode)
                }
            }
    }
}
