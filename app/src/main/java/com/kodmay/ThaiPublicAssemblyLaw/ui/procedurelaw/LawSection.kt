package com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kodmay.ThaiPublicAssemblyLaw.R
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionParameters
import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection

class LawSection(val title: String, val list: List<LawListData>, val listener: ListListener):
    StatelessSection(SectionParameters.builder()
        .itemResourceId(R.layout.list_item_law)
        .headerResourceId(R.layout.list_item_section_law)
        .build()) {


    override fun getContentItemsTotal(): Int {
        return list.size
    }

    override fun onBindItemViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val itemHolder = holder as ItemViewHolder
        val item = list[position]
        itemHolder.tvLabel.text = item.title
        itemHolder.rootView.setOnClickListener {
            if (item.isCat){
                item.catData?.let { listener.onCatSelect(it) }
            }else{
                listener.onLawSelect(item.lawId)
            }
        }
    }

    override fun getItemViewHolder(view: View): RecyclerView.ViewHolder {
        return ItemViewHolder(view)
    }

    override fun getHeaderViewHolder(view: View): RecyclerView.ViewHolder {
        return HeaderViewHolder(view)
    }

    override fun onBindHeaderViewHolder(holder: RecyclerView.ViewHolder?) {
        val headerHolder = holder as HeaderViewHolder
        headerHolder.tvTitle.text = title
    }
}

private class HeaderViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {

    val tvTitle: TextView

    init {

        tvTitle = view.findViewById(R.id.tv_title)
    }
}

private class ItemViewHolder internal constructor(val rootView: View) :
    RecyclerView.ViewHolder(rootView) {
    val tvLabel: TextView

    init {
        tvLabel = rootView.findViewById(R.id.tv_label)
    }
}