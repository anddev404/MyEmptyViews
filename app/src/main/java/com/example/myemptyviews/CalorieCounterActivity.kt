package com.example.myemptyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CalorieCounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calorie_counter)
        supportActionBar?.hide()
    }
}