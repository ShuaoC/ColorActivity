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


        val eventListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                val messageString = p0!!.getItemAtPosition(p2).toString()

                Toast
                    .makeText(this@ColorActivity, messageString, Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }

        spinner.onItemSelectedListener = eventListener


    }
    }