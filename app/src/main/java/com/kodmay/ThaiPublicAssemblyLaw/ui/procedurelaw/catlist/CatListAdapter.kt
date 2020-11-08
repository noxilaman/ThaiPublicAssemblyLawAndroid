package com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData
import kotlinx.android.synthetic.main.list_item_law.view.*

class CatListAdapter(
    private var mValues: List<CatData>, val catListener: CatListener
) : RecyclerView.Adapter<CatListAdapter.ViewHolder>() {

    interface CatListener{
        fun onSelectCat(catdata: CatData)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_law, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.mContentView.text = item.c_name

        holder.mView.setOnClickListener {  catListener.onSelectCat(item)  }
    }

    override fun getItemCount(): Int = mValues.size

    fun updateData(catItemList: List<CatData>) {
        mValues = catItemList
        notifyDataSetChanged()
    }

    fun getData():List<CatData> = mValues

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mContentView: TextView = mView.tv_label

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
