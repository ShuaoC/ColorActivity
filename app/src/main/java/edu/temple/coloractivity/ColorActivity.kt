package edu.temple.coloractivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.layout)

        val colors = arrayOf("White","Darkgrey","Blue","Green","Cyan","Magenta","Yellow","silver","Teal","Lime","Maroon")

        val adapter = ColorAdapter(this, colors)

        spinner.adapter = adapter
        val eventListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                layout.setBackgroundColor(Color.parseColor(adapter.getItem(spinner.selectedItemPosition)))
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        spinner.onItemSelectedListener = eventListener;
    }
    }