package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathpuzzles.StartPage.Companion.levelList
import com.example.mathpuzzles.StartPage.Companion.ssp

class puzzles : AppCompatActivity() {

    private lateinit var grid: GridView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles)




        grid = findViewById(R.id.gridview)

        var myAdpter = MyAdapter(this@puzzles)

        grid.adapter = myAdpter


        grid.setOnItemClickListener { _, _, position, _ ->

            if (levelList[position].equals("clear") || levelList[position].equals("skip")){

                val curlvl = Intent(this@puzzles , leveldetail::class.java).putExtra("cnt",position)

                startActivity(curlvl)
                finish()
            } else
            {
                Toast.makeText(this@puzzles,"Not Unlock yet",Toast.LENGTH_SHORT).show()
            }
        }
    }
}