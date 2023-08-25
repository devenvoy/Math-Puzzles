package com.example.mathpuzzles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.mathpuzzles.StartPage.Companion.levellist

class myAdapter( var puzzpage: puzzles) : BaseAdapter() {
    override fun getCount(): Int = levellist.size

    override fun getItem(position: Int): Any = position

    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var itemView   = LayoutInflater(puzzpage).inflate(R.layout.myitem,parent ,false)

    }
}