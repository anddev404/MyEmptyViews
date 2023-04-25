package com.anddev404.myemptyviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anddev404.myemptyviews.model.ComponentItem
import com.anddev404.myemptyviews.view_adapters.ComponentRecyclerViewAdapter

class CalorieCounterActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calorie_counter)
        setUpActionBar()
        setUpRecyclerView()
    }

    private fun setUpActionBar() {
        supportActionBar?.hide()
    }

    private fun setUpRecyclerView() {
        recyclerView = findViewById(R.id.components_recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ComponentRecyclerViewAdapter(ComponentItem.getComponentList())
        recyclerView.adapter = adapter
    }
}