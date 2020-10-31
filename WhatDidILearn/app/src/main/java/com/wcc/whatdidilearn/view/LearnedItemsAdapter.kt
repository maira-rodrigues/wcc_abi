package com.wcc.whatdidilearn.view

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wcc.whatdidilearn.R
import com.wcc.whatdidilearn.entities.LearnedItem

class LearnedItemsAdapter: RecyclerView.Adapter<LearnedItemsAdapter.LearnedItemViewHolder>() {
    var data = listOf<LearnedItem>()

    inner class LearnedItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val titleItem: TextView = itemView.findViewById(R.id.text_item_title)
        val descriptionItem: TextView = itemView.findViewById(R.id.text_item_description)
        val levelItem: View = itemView.findViewById(R.id.layout_item_level)

        fun bind(title: String, description: String, color: Int){
            titleItem.text = title
            descriptionItem.text = description
            levelItem.setBackgroundResource(color)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnedItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: LearnedItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }
}