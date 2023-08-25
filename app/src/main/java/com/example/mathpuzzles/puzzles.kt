package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathpuzzles.StartPage.Companion.levellist

class puzzles : AppCompatActivity() {

    lateinit var gridview : GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles)

        gridview = findViewById(R.id.gridview)

//        var myadapter  = myAdapter(this@puzzles , levellist)
//        gridview.adapter = myadapter



    }
}