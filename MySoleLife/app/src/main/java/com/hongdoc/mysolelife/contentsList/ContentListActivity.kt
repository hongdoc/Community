package com.hongdoc.mysolelife.contentsList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hongdoc.mysolelife.R

class ContentListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_list)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<String>()
        items.add("a")
        items.add("b")
        items.add("c")

        val rvAdapter = ContentRVAdapter(items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

    }

}