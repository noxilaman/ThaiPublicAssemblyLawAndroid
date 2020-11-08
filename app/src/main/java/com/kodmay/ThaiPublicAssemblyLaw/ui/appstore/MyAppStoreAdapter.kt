package com.kodmay.ThaiPublicAssemblyLaw.ui.appstore

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppStoreData


import com.kodmay.ThaiPublicAssemblyLaw.ui.appstore.AppStoreFragment.OnListFragmentInteractionListener

import kotlinx.android.synthetic.main.list_item_appstore.view.*

class MyAppStoreAdapter(
    private val mValues: List<AppStoreData>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<MyAppStoreAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as AppStoreData
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            mListener?.onListFragmentInteraction(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_appstore, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]

        Glide.with(holder.img).load(mValues[position].app_img).into(holder.img)
        holder.title.text = item.name

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val img: ImageView = mView.img
        val title: TextView = mView.tv_title

        override fun toString(): String {
            return super.toString() + " '" + title.text + "'"
        }
    }
}
