package com.example.mathpuzzles

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartPage : AppCompatActivity() {

    lateinit var btn_continue : TextView
    lateinit var btn_puzzle : TextView
    lateinit var btn_buyPro : TextView

    companion object{
        lateinit var sp : SharedPreferences
        lateinit var editor : Editor
        var currentLvl = 0

        var PENDING : String = "pending"
        var levellist : ArrayList<String>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_continue = findViewById(R.id.continuebtn)
        btn_puzzle = findViewById(R.id.puzzlebtn)
        btn_buyPro = findViewById(R.id.bproo)

        sp = getSharedPreferences("DataStore", MODE_PRIVATE)
        editor = sp.edit()

        for (x in 0 .. 69){
            levellist.add(PENDING)
            editor.putString("status$x",PENDING)
        }





    }
}