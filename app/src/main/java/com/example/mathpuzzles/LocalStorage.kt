package com.example.mathpuzzles

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LocalStorage : AppCompatActivity() {

    private lateinit var number: TextView
    private var cnt = 0;
    private lateinit var sp: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_storage)

        sp = getSharedPreferences("hhh", MODE_PRIVATE)
        editor = sp.edit()

        cnt = sp.getInt("keyyyy", 15)

        number = findViewById(R.id.number)
        number.text = "$cnt"


    }

    fun myclick(view: View) {

        cnt++
        number.text = "$cnt"
        editor.putInt("keyyyy", cnt)
        editor.apply()

    }
}