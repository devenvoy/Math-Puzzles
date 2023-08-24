package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathpuzzles.StartPage.Companion.level

class puzzles : AppCompatActivity() {

    lateinit var grid: GridView

    companion object {
        var levels = hashMapOf(
            "1" to false,
            "2" to false,
            "3" to false,
            "4" to false,
            "5" to false,
            "6" to false,
            "7" to false,
            "8" to false,
            "9" to false,
            "10" to false,
            "11" to false,
            "12" to false,
            "13" to false,
            "14" to false,
            "15" to false,
            "16" to false,
            "17" to false,
            "18" to false,
            "19" to false,
            "20" to false,
            "21" to false,
            "22" to false,
            "23" to false,
            "24" to false,
            "25" to false,
            "26" to false,
            "27" to false,
            "28" to false,
            "29" to false,
            "30" to false,
            "31" to false,
            "32" to false,
            "33" to false,
            "34" to false,
            "35" to false,
            "36" to false,
            "37" to false,
            "38" to false,
            "39" to false,
            "40" to false,
            "41" to false,
            "42" to false,
            "43" to false,
            "44" to false,
            "45" to false,
            "46" to false,
            "47" to false,
            "48" to false,
            "49" to false,
            "50" to false,
            "51" to false,
            "52" to false,
            "53" to false,
            "54" to false,
            "55" to false,
            "56" to false,
            "57" to false,
            "58" to false,
            "59" to false,
            "60" to false,
            "61" to false,
            "62" to false,
            "63" to false,
            "64" to false,
            "65" to false,
            "66" to false,
            "67" to false,
            "68" to false,
            "69" to false,
            "70" to false
        )
        var plevels = arrayOf(
            "1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles)

        grid = findViewById(R.id.gridview)

        var myAdpter = MyAdapter(this@puzzles, plevels)

        grid.adapter = myAdpter

        val curlvl = Intent(this@puzzles , leveldetail::class.java)

        grid.setOnItemClickListener { parent, view, position, id ->
            if (plevels[position].isNotEmpty()){
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