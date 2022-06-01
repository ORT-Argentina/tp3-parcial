package com.example.appbase.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.appbase.R

class MainActivity2 : AppCompatActivity() {

    lateinit var btnIngresar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onStart() {
        super.onStart()
        btnIngresar = findViewById(R.id.btn_ingresar)

        btnIngresar.setOnClickListener {
            startActivity(Intent(this, LogginActivity::class.java))
            finish()
        }

    }
}
