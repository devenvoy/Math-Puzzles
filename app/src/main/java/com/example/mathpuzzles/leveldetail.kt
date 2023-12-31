package com.example.mathpuzzles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathpuzzles.StartPage.Companion.level
import com.example.mathpuzzles.puzzles.Companion.levels
import com.example.mathpuzzles.puzzles.Companion.plevels

class leveldetail : AppCompatActivity() {


    var imagearray = arrayOf(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5,
        R.drawable.p6,
        R.drawable.p7,
        R.drawable.p8,
        R.drawable.p9,
        R.drawable.p10,
        R.drawable.p11,
        R.drawable.p12,
        R.drawable.p13,
        R.drawable.p14,
        R.drawable.p15,
        R.drawable.p16,
        R.drawable.p17,
        R.drawable.p18,
        R.drawable.p19,
        R.drawable.p20,
        R.drawable.p21,
        R.drawable.p22,
        R.drawable.p23,
        R.drawable.p24,
        R.drawable.p25,
        R.drawable.p26,
        R.drawable.p27,
        R.drawable.p28,
        R.drawable.p29,
        R.drawable.p30,
        R.drawable.p31,
        R.drawable.p32,
        R.drawable.p33,
        R.drawable.p34,
        R.drawable.p35,
        R.drawable.p36,
        R.drawable.p37,
        R.drawable.p38,
        R.drawable.p39,
        R.drawable.p40,
        R.drawable.p41,
        R.drawable.p42,
        R.drawable.p43,
        R.drawable.p44,
        R.drawable.p45,
        R.drawable.p46,
        R.drawable.p47,
        R.drawable.p48,
        R.drawable.p49,
        R.drawable.p50,
        R.drawable.p51,
        R.drawable.p52,
        R.drawable.p53,
        R.drawable.p54,
        R.drawable.p55,
        R.drawable.p56,
        R.drawable.p57,
        R.drawable.p58,
        R.drawable.p59,
        R.drawable.p60,
        R.drawable.p61,
        R.drawable.p62,
        R.drawable.p63,
        R.drawable.p64,
        R.drawable.p65,
        R.drawable.p66,
        R.drawable.p67,
        R.drawable.p68,
        R.drawable.p69,
        R.drawable.p70
    )


    val buttonIds = arrayOf(
        R.id.num1,
        R.id.num2,
        R.id.num3,
        R.id.num4,
        R.id.num5,
        R.id.num6,
        R.id.num7,
        R.id.num8,
        R.id.num9,
        R.id.num0
    )
    lateinit var textbox: TextView
    lateinit var puzzleboard: TextView
    lateinit var backnum: ImageView
    lateinit var levelImg: ImageView
    lateinit var submit: Button
    lateinit var skipbtn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leveldetail)

        textbox = findViewById(R.id.numinput)
        submit = findViewById(R.id.subbtn)

        skipbtn = findViewById(R.id.skipbtn)

        puzzleboard = findViewById(R.id.level)
        levelImg = findViewById(R.id.levelimg)
        backnum = findViewById(R.id.backnum)

        levelImg.setImageResource(imagearray[level])



        puzzleboard.setText("Level ${level + 1}")
        for (buttonId in buttonIds) {
            val num: TextView = findViewById(buttonId)

            num.setOnClickListener {
                textbox.text = "${textbox.text}${num.text}"
            }
        }


        skipbtn.setOnClickListener {
            if (level < 69) {
                level++
                plevels[level] = (level + 1).toString()
                startActivity(Intent(this@leveldetail, leveldetail::class.java))
                finish()
            } else {
                Toast.makeText(this@leveldetail, "No More Level ", Toast.LENGTH_SHORT).show()
            }
        }

        backnum.setOnClickListener {
            if (textbox.text.isNotEmpty()) {
                textbox.text = textbox.text.toString().subSequence(0, textbox.text.length - 1)
            }
        }

        val ir = Intent(this@leveldetail, result::class.java)

        submit.setOnClickListener {
            if (textbox.text == (level + 1).toString()) {
                levels[plevels[level]] = true
                level++
                plevels[level] = (level + 1).toString()
                startActivity(ir)
                finish()
            } else {
                Toast.makeText(this@leveldetail, "Wrong Answer", Toast.LENGTH_SHORT).show()
            }

        }


    }

}

