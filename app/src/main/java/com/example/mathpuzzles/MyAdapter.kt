package com.example.mathpuzzles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mathpuzzles.puzzles.Companion.levels

class MyAdapter(var puzzles: puzzles, var plvls: Array<String>) : BaseAdapter() {

    lateinit var imge: ImageView
    lateinit var num: TextView

    override fun getCount(): Int = plvls.size

    override fun getItem(position: Int): Any = position

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var vv: View = LayoutInflater.from(puzzles).inflate(R.layout.myitem, parent, false)

        imge = vv.findViewById(R.id.lockimg)
        num = vv.findViewById(R.id.levelnum)

        if (plvls[position].isNotEmpty()) {
            num.text = plvls[position]
            imge.setBackgroundResource(R.drawable.lockimgbg)
            imge.setImageResource(R.drawable.lockimgbg)
            if (levels[plvls[position]] == true) {
                num.text = plvls[position]
                imge.setImageResource(R.drawable.tick)
            } else {
                num.text = plvls[position]
            }
        }
        return vv
    }

}
