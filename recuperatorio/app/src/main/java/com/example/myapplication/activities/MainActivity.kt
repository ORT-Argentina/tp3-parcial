package com.example.myapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    lateinit var splashBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        splashBtn = findViewById(R.id.splashBtn)

    }

    override fun onStart() {
        super.onStart()
        splashBtn.setOnClickListener{
            var intent = Intent(this,SecondaryActivity::class.java)
            startActivity(intent)
        }
    }
}