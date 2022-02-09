package com.example.button_ex_1

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.startButton);
        start.setOnClickListener {
            Toast.makeText(this, "Start application", Toast.LENGTH_SHORT).show()
            val textOutPut =findViewById<TextView>(R.id.textOutPut)
            textOutPut.text = "Application Starting..."

        }



        val stop = findViewById<Button>(R.id.stopButton);
        stop.setOnClickListener {
            Toast.makeText(this, "Stop application", Toast.LENGTH_SHORT).show()
            val textOutPut =findViewById<TextView>(R.id.textOutPut)
            textOutPut.text = "Application Stoping..."
        }

        var num = 0;
        val zoomInButton = findViewById<Button>(R.id.zoomInButton)
        val zoomOutButton = findViewById<Button>(R.id.zoomOutButton)
        val zoomOutPut = findViewById<TextView>(R.id.zoomOutPut)
        zoomInButton.setOnClickListener{
            num++
            zoomOutPut.text = num.toString()

            zoomOutButton.setOnClickListener {
                num--
                zoomOutPut.text = num.toString()

            }
        }
       // Floating action button
        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
        }

    }

}