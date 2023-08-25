package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathpuzzles.StartPage.Companion.level
import com.example.mathpuzzles.StartPage.Companion.ssp

class puzzles : AppCompatActivity() {

    private lateinit var grid: GridView

    private val levelList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles)

        for (i in 0..69){
            var sat = ssp.getString("$i","pending")
            levelList.add(sat.toString())
        }
        Log.e("list", "onCreate: $levelList" )

        grid = findViewById(R.id.gridview)

        var myAdpter = MyAdapter(this@puzzles, levelList)

        grid.adapter = myAdpter

        val curlvl = Intent(this@puzzles , leveldetail::class.java)

        grid.setOnItemClickListener { _, _, position, _ ->

            if (levelList[position] == "clear" || levelList[position] == "skip"){
                level = position
                startActivity(curlvl)
                finish()
            } else
            {
                Toast.makeText(this@puzzles,"Not Unlock yet",Toast.LENGTH_SHORT).show()
            }
        }

    }
}