package com.example.mathpuzzles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mathpuzzles.StartPage.Companion.CLEAR
import com.example.mathpuzzles.StartPage.Companion.PENDING
import com.example.mathpuzzles.StartPage.Companion.SKIP
import com.example.mathpuzzles.StartPage.Companion.levellist
import com.example.mathpuzzles.StartPage.Companion.sp
import kotlin.math.min

class myAdapter(var puzzpage: puzzles, var startPos: Int) : BaseAdapter() {

    lateinit var lockimg: ImageView
    lateinit var levelnum: TextView
    override fun getCount(): Int = minOf(24, levellist.size - startPos)

    override fun getItem(position: Int): Any = position

    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var position = position + startPos

        var itemView = LayoutInflater.from(puzzpage).inflate(R.layout.myitem, parent, false)

        lockimg = itemView.findViewById(R.id.lockimg)
        levelnum = itemView.findViewById(R.id.levelnum)


        if (position == sp.getInt("curlvl", 0)) {
            levellist[position] = SKIP
        }

        if (levellist[position] == CLEAR) {

            lockimg.setImageResource(R.drawable.tick)
            lockimg.setBackgroundResource(R.drawable.lockimgbg)
            levelnum.text = "${position + 1}"

        } else if (levellist[position] == SKIP) {

            lockimg.setImageResource(0)
            lockimg.setBackgroundResource(R.drawable.lockimgbg)
            levelnum.text = "${position + 1}"

        } else if (levellist[position] == PENDING) {

            lockimg.setImageResource(R.drawable.lock)

        }

        return itemView
    }
}