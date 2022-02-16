package edu.temple.coloractivity

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ColorAdapter(_context: Context, _colors: Array<String>) : BaseAdapter() {

    val context = _context
    val colors = _colors

    override fun getCount(): Int {
        return colors.size
    }

    override fun getItem(p0: Int): String {
        return colors[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = getView(position, convertView, parent)
        view.setBackgroundColor(Color.parseColor(getItem(position)))
        return view
    }

}