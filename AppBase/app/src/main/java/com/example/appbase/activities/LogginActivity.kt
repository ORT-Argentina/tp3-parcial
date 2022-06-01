package com.example.appbase.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.appbase.R

class LogginActivity : AppCompatActivity() {

    lateinit var btnIngresar : Button
    lateinit var txtLogin : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggin)
    }

    override fun onStart() {
        super.onStart()
        btnIngresar = findViewById(R.id.btn_Ingresar_loggin)

        txtLogin = findViewById(R.id.editTextInputEmail)
        var textoAEnviar = txtLogin.text.toString()

        btnIngresar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent.putExtra("Email",textoAEnviar))
            finish()
        }

    }
}