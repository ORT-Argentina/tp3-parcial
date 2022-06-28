package com.example.aplicacionparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var btnSplash : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSplash = findViewById(R.id.btnSplash)
        btnSplash.setOnClickListener{
            var intentNav = Intent(this, SecondActivity::class.java)
            startActivity(intentNav)
            this.finish()
        }
    }
}