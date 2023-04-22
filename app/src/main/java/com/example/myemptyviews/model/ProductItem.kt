package com.example.myemptyviews.model

import android.app.Application
import android.graphics.drawable.Drawable
import com.example.myemptyviews.R

data class ProductItem(var name: String, var amount: Int, var price: String, var image: Drawable) {
    companion object {

        fun getProductList(application: Application): ArrayList<ProductItem> {

            var list = ArrayList<ProductItem>()
            val resources = application.resources

            val drawableDonut = resources.getDrawable(R.drawable.image_donut)
            val drawablePeas = resources.getDrawable(R.drawable.image_peas)
            val drawableOranges = resources.getDrawable(R.drawable.image_orange)

            list.add(
                ProductItem(
                    resources.getString(R.string.donut),
                    resources.getInteger(R.integer.donut_pc),
                    resources.getString(R.string.donut_price),
                    drawableDonut
                )
            )
            list.add(
                ProductItem(
                    resources.getString(R.string.peas),
                    resources.getInteger(R.integer.peas_pc),
                    resources.getString(R.string.peas_price_),
                    drawablePeas
                )
            )
            list.add(
                ProductItem(
                    resources.getString(R.string.oranges),
                    resources.getInteger(R.integer.oranges_pc),
                    resources.getString(R.string.oranges_price),
                    drawableOranges
                )
            )
            return list
        }
    }
}

