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

        val items = ArrayList<ContentModel>()
        items.add(ContentModel("imageurl1", "title1"))
        items.add(ContentModel("imageurl2", "title2"))
        items.add(ContentModel("imageurl3", "title3"))

        val rvAdapter = ContentRVAdapter(items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

    }

}