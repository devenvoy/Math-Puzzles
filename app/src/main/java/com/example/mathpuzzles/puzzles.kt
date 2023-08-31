package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.mathpuzzles.StartPage.Companion.CLEAR
import com.example.mathpuzzles.StartPage.Companion.SKIP
import com.example.mathpuzzles.StartPage.Companion.levellist

class puzzles : AppCompatActivity() {

    lateinit var viewpagerr : ViewPager

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(
            Intent(this@puzzles, StartPage::class.java)
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles)


        viewpagerr = findViewById(R.id.viewpagerr)

        var MypAdapter = MypAdapter(this@puzzles)

        viewpagerr.adapter = MypAdapter

        viewpagerr.currentItem = 0

    }
}