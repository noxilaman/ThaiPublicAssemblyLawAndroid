package com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaData
import kotlinx.android.synthetic.main.list_item_law.view.*

class DekaListAdapter(
    private var mValues: List<DekaData>, val dekaListener: DekaListener
) : RecyclerView.Adapter<DekaListAdapter.ViewHolder>() {

    interface DekaListener{
        fun onSelectDeka(dekaData: DekaData)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_deka, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.mContentView.text = item.c_name

        holder.mView.setOnClickListener {  dekaListener.onSelectDeka(item)  }
    }

    override fun getItemCount(): Int = mValues.size

    fun updateData(itemList: List<DekaData>) {
        mValues = itemList
        notifyDataSetChanged()
    }

    fun clear(){
        mValues = mutableListOf()
        notifyDataSetChanged()
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mContentView: TextView = mView.tv_label

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
