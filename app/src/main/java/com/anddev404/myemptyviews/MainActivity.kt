package com.anddev404.myemptyviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var loginImageView: ImageView
    private lateinit var basketImageView: ImageView
    private lateinit var calorieCounterImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = resources.getString(R.string.choose_activity)

        initializeViews()
        setOnClickListeners()

    }

    private fun initializeViews() {
        loginImageView = findViewById(R.id.imageView1)
        basketImageView = findViewById(R.id.imageView2)
        calorieCounterImageView = findViewById(R.id.imageView3)

    }

    private fun setOnClickListeners() {
        loginImageView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        basketImageView.setOnClickListener {
            val intent = Intent(this, BasketActivity::class.java)
            startActivity(intent)
        }
        calorieCounterImageView.setOnClickListener {
            val intent = Intent(this, CalorieCounterActivity::class.java)
            startActivity(intent)
        }
    }
}