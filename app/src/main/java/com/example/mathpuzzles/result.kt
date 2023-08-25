package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class result : AppCompatActivity() {

    lateinit var con: Button
    lateinit var mainmenu: Button
    lateinit var probtn: Button
    lateinit var textnumber: TextView


    var lll = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        lll = intent.getIntExtra("cntt",0)
        con = findViewById(R.id.bcontinuee)
        mainmenu = findViewById(R.id.bmainmenu)
        probtn = findViewById(R.id.bproo)
        textnumber = findViewById(R.id.textnumber)


        textnumber.text = "Level ${lll} Completed"
        val nextlvl = Intent(this@result, leveldetail::class.java).putExtra("cnt",lll)
        val mainpage = Intent(this@result, StartPage::class.java)

        con.setOnClickListener {
            if (lll < 69) {
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