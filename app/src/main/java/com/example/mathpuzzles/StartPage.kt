package com.example.mathpuzzles

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartPage : AppCompatActivity() {

    lateinit var continuebtn: TextView
    lateinit var puzzlelvl: TextView

    companion object {

        lateinit var ssp: SharedPreferences
        lateinit var editor: Editor

        val levelList = ArrayList<String>()

    }
    var level = 0


    lateinit var buypro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        continuebtn = findViewById(R.id.continuebtn)
        puzzlelvl = findViewById(R.id.puzzlebtn)
        buypro = findViewById(R.id.butpro)

        ssp = getSharedPreferences("level", MODE_PRIVATE)
        editor = ssp.edit()
        level = ssp.getInt("level",0)


        for (i in 0..69){
            var sat = ssp.getString("status$i","pending")
            levelList.add(sat.toString())
        }

        val levels = Intent(this@StartPage, puzzles::class.java)
        val leveldet = Intent(this@StartPage, leveldetail::class.java).putExtra("cnt",levels)

        puzzlelvl.setOnClickListener {
            startActivity(levels)
        }

        continuebtn.setOnClickListener {
            startActivity(leveldet)
        }

    }
}