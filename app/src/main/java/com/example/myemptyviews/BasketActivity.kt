package com.example.myemptyviews

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Html
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class BasketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket)
        setUpActionBar()


    }

    private fun setUpActionBar() {

        supportActionBar?.title =
            Html.fromHtml(
                "<font color=\"${resources.getColor(R.color.black)}\">${
                    resources.getString(
                        R.string.your_basket
                    )
                }</font>"
            )
        supportActionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.white)))
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        supportActionBar?.setHomeAsUpIndicator(com.google.android.material.R.drawable.ic_arrow_back_black_24);
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