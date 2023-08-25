package com.example.mathpuzzles

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class puzzles : AppCompatActivity() {

    lateinit var gridview : GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles)

        gridview = findViewById(R.id.gridview)

        var myadapter  = myAdapter(this@puzzles)
        gridview.adapter = myadapter



    }
}