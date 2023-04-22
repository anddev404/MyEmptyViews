package com.example.myemptyviews.view_adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myemptyviews.R
import com.example.myemptyviews.compound_views.ProductAmountView
import com.example.myemptyviews.model.ProductItem


class ProductRecyclerViewAdapter(
    private val productList: List<ProductItem>
) : RecyclerView.Adapter<ProductRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_product, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.nameTextView.text = product.name
        holder.amountView.setAmount(product.amount)
        holder.priceTextView.text = product.price
        holder.imageView.setImageDrawable(product.image)

    }

    override fun getItemCount(): Int = productList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.product_name)
        val priceTextView: TextView = itemView.findViewById(R.id.price)
        val imageView: ImageView = itemView.findViewById(R.id.product_image)
        val amountView: ProductAmountView = itemView.findViewById(R.id.product_amount)
    }

}