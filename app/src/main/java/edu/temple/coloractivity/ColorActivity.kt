package edu.temple.coloractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        val colors = arrayOf("Gray", "Magenta", "Yellow", "Red", "Purple")
/*
        val adapter = ArrayAdapter(this
            , android.R.layout.simple_spinner_dropdown_item
            , colors)

 */

        val adapter = ColorAdapter(this, colors)

        spinner.adapter = adapter



    }
    }