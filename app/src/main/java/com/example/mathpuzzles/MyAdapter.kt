package com.example.mathpuzzles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var puzzles: puzzles) : BaseAdapter() {

    lateinit var imge: ImageView
    lateinit var num: TextView

    override fun getCount(): Int = StartPage.levelList.size

    override fun getItem(position: Int): Any = position

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var vv: View = LayoutInflater.from(puzzles).inflate(R.layout.myitem, parent, false)

        imge = vv.findViewById(R.id.lockimg)
        num = vv.findViewById(R.id.levelnum)

        if (StartPage.levelList[position].equals("clear")) {

            num.text = "${position + 1}"
            imge.setImageResource(R.drawable.tick)
            imge.setBackgroundResource(R.drawable.lockimgbg)

        } else if (StartPage.levelList[position].equals("skip")) {

            num.text = "${position + 1}"
            imge.setBackgroundResource(R.drawable.lockimgbg)
            imge.setImageResource(0)

        } else if (StartPage.levelList[position].equals("pending")) {

            imge.setImageResource(R.drawable.lock)

        }

        return vv
    }

}
