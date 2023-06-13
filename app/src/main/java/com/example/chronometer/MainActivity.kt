package com.example.chronometer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var chronometer:Chronometer = findViewById(R.id.chronometer2)
        var startbut:Button = findViewById(R.id.startbut)
        var stopbutton:Button = findViewById(R.id.stopbutton)
        startbut.setOnClickListener{
            chronometer.start()
        }
        stopbutton.setOnClickListener{
            chronometer.stop()
        }
    }
}