package com.example.mathpuzzles

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.example.mathpuzzles.StartPage.Companion.levellist

class MypAdapter(var puzzles: puzzles) : PagerAdapter() {

    var gridlist = ArrayList<String>()
    lateinit var gridView: GridView
    override fun getCount(): Int = 3

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var pv = LayoutInflater.from(puzzles).inflate(R.layout.mypitem, container, false)

        gridView = pv.findViewById(R.id.gridview)

        var myadapter = myAdapter(puzzles,position * 24)

        gridView.adapter = myadapter

        gridView.setOnItemClickListener { parent, view, position, id ->

            if (levellist[position].equals(StartPage.CLEAR) || levellist[position].equals(
                    StartPage.SKIP
                )
            ) {
                puzzles.startActivity(
                    Intent(puzzles, leveldetail::class.java).putExtra(
                        "cnt",
                        position
                    )
                )
                puzzles.finish()
            } else {
                Toast.makeText(puzzles, "Not unlock yet", Toast.LENGTH_SHORT).show()
            }
        }

        container.addView(pv)

        return pv
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

    fun glmake(start: Int, end: Int) {
        for (x in start..end) {
            gridlist.add(levellist[x])
        }
    }
}
