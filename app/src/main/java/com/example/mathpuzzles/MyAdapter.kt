package com.example.mathpuzzles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var puzzles: puzzles, var plvls: ArrayList<String>) : BaseAdapter() {

    lateinit var imge: ImageView
    lateinit var num: TextView

    override fun getCount(): Int = plvls.size

    override fun getItem(position: Int): Any = position

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var vv: View = LayoutInflater.from(puzzles).inflate(R.layout.myitem, parent, false)

        imge = vv.findViewById(R.id.lockimg)
        num = vv.findViewById(R.id.levelnum)

        if (plvls[position] == "pending") {

            imge.setImageResource(R.drawable.lock)

        } else if (plvls[position] == "skip") {

            num.text = "${position + 1}"
            imge.setBackgroundResource(R.drawable.lockimgbg)

        } else if (plvls[position] == "clear") {

            num.text = "${position + 1}"
            imge.setImageResource(R.drawable.tick)
            imge.setBackgroundResource(R.drawable.lockimgbg)

        }

        return vv
    }

}
