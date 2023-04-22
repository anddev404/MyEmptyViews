package com.example.myemptyviews

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Html
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myemptyviews.model.ProductItem
import com.example.myemptyviews.view_adapters.ProductRecyclerViewAdapter


class BasketActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket)
        setUpActionBar()
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        recyclerView = findViewById(R.id.product_recycler_view)
        recyclerView.setHasFixedSize(true);
        recyclerView.layoutManager = LinearLayoutManager(this)
        
        var adapter = ProductRecyclerViewAdapter(ProductItem.getProductList(application))
        recyclerView.adapter = adapter
    }

    private fun setUpActionBar() {

        supportActionBar?.title = Html.fromHtml(
            "<b><font color=\"${resources.getColor(R.color.black, theme)}\">${
                resources.getString(
                    R.string.your_basket
                )
            }</font></b>"
        )
        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(
                resources.getColor(
                    R.color.white, theme
                )
            )
        )
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(com.google.android.material.R.drawable.ic_arrow_back_black_24)
        supportActionBar?.elevation = 0f
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}