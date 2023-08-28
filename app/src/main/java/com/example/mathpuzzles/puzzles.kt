package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathpuzzles.StartPage.Companion.CLEAR
import com.example.mathpuzzles.StartPage.Companion.SKIP
import com.example.mathpuzzles.StartPage.Companion.levellist

class puzzles : AppCompatActivity() {

    lateinit var gridview: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles)

        gridview = findViewById(R.id.gridview)

        var myadapter = myAdapter(this@puzzles)

        gridview.adapter = myadapter

        gridview.setOnItemClickListener { parent, view, position, id ->

            if (levellist[position].equals(CLEAR) || levellist[position].equals(SKIP)) {
                startActivity(
                    Intent(this@puzzles, leveldetail::class.java).putExtra(
                        "cnt",
                        position
                    )
                )
                finish()
            } else {
                Toast.makeText(this@puzzles, "Not unlock yet", Toast.LENGTH_SHORT).show()
            }
        }


    }
}