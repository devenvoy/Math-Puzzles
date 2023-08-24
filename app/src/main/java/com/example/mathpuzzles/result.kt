package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathpuzzles.StartPage.Companion.level

class result : AppCompatActivity() {

    lateinit var con: Button
    lateinit var mainmenu: Button
    lateinit var probtn: Button
    lateinit var textnumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        con = findViewById(R.id.bcontinuee)
        mainmenu = findViewById(R.id.bmainmenu)
        probtn = findViewById(R.id.bproo)
        textnumber = findViewById(R.id.textnumber)


        textnumber.text = "Level ${level + 1} Completed"
        val nextlvl = Intent(this@result, leveldetail::class.java)
        val mainpage = Intent(this@result, StartPage::class.java)

        con.setOnClickListener {
            if (level < 69) {
                startActivity(nextlvl)
                finish()
            } else {
                Toast.makeText(this@result, "No More Level ", Toast.LENGTH_SHORT).show()
            }
        }


        mainmenu.setOnClickListener {
            startActivity(mainpage)
            finish()
        }


    }
}