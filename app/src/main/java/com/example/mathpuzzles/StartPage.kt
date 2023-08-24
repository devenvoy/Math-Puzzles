package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartPage : AppCompatActivity() {

    lateinit var continuebtn: TextView
    lateinit var puzzlelvl: TextView

    companion object {

        var level = 0
    }

    lateinit var buypro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        continuebtn = findViewById(R.id.continuebtn)
        puzzlelvl = findViewById(R.id.puzzlebtn)
        buypro = findViewById(R.id.butpro)

        val levels = Intent(this@StartPage, puzzles::class.java)
        val leveldet = Intent(this@StartPage, leveldetail::class.java)

        puzzlelvl.setOnClickListener {
            startActivity(levels)
        }

        continuebtn.setOnClickListener {
            startActivity(leveldet)
        }

    }
}