package com.hongdoc.mysolelife.contentsList

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hongdoc.mysolelife.R

class ContentRVAdapter(val items : ArrayList<String>) : RecyclerView.Adapter<ContentRVAdapter.Viewholer>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentRVAdapter.Viewholer {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_rv_item, parent, false)
        return Viewholer(v)
    }

    override fun onBindViewHolder(holder: ContentRVAdapter.Viewholer, position: Int) {
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class Viewholer(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(item : String){

        }
    }

}