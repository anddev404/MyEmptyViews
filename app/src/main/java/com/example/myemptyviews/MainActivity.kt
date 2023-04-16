package com.example.myemptyviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var loginImageView: ImageView
    lateinit var basketImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = resources.getString(R.string.choose_activity)

        initializeViews()
        setOnClickListeners()

    }

    fun initializeViews() {
        loginImageView = findViewById(R.id.imageView1)
        basketImageView = findViewById(R.id.imageView2)

    }

    fun setOnClickListeners() {
        loginImageView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        basketImageView.setOnClickListener {
            val intent = Intent(this, BasketActivity::class.java)
            startActivity(intent)
        }
    }
}