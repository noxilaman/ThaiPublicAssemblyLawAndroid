package com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData
import kotlinx.android.synthetic.main.list_item_bookmark.view.*


class BookmarkAdapter(
    private val mValues: List<LawData>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<BookmarkAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    interface OnListFragmentInteractionListener {
        fun onListFragmentInteraction(item: LawData)
        fun onDelete(item: LawData)
    }

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as LawData
            mListener?.onListFragmentInteraction(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_bookmark, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.tvLabel.text = item.c_name
        holder.imgDelete.setOnClickListener {
            mListener?.onDelete(item)
        }

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val tvLabel: TextView = mView.tv_label
        val imgDelete: ImageView = mView.img_delete

        override fun toString(): String {
            return super.toString() + " '" + tvLabel.text + "'"
        }
    }
}
