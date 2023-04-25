package com.anddev404.myemptyviews.view_adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anddev404.myemptyviews.R
import com.anddev404.myemptyviews.model.ComponentItem

class ComponentRecyclerViewAdapter(
    private val componentList: List<ComponentItem>
) : RecyclerView.Adapter<ComponentRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_component, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = componentList[position]
        holder.nameTextView.text = product.name
        holder.weightTextView.text = product.amount
        holder.kcalTextView.text = product.kcal
    }

    override fun getItemCount(): Int = componentList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.component_name)
        val weightTextView: TextView = itemView.findViewById(R.id.component_weight)
        val kcalTextView: TextView = itemView.findViewById(R.id.component_kcal)
    }
}