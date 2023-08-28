package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class result : AppCompatActivity() {


    lateinit var textnumber : TextView
    lateinit var btn_continuee : Button
    lateinit var btn_mainmenu : Button
    lateinit var btn_proo : Button
    var ll = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textnumber = findViewById(R.id.textnumber)
        btn_continuee = findViewById(R.id.btn_continuee)
        btn_mainmenu = findViewById(R.id.btn_mainmenu)
        btn_proo = findViewById(R.id.btn_proo)

        ll = intent.getIntExtra("cnt", 0)

        textnumber.text = "Level $ll Completed"

        btn_continuee.setOnClickListener {
            startActivity(Intent(this@result , leveldetail::class.java).putExtra("cnt" , ll))
            finish()
        }

        btn_mainmenu.setOnClickListener {
            startActivity(Intent(this@result , StartPage::class.java))
            finish()
        }


    }
}