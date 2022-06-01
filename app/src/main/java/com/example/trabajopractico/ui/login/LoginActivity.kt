package com.example.trabajopractico.ui.login

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.trabajopractico.MainActivity
import com.example.trabajopractico.databinding.ActivityLoginBinding

import com.example.trabajopractico.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val info: Button = findViewById(R.id.loginButton)
        info.setOnClickListener(View.OnClickListener { v ->
            val intent = Intent(v.context, MainActivity::class.java)
            startActivityForResult(intent, 0)
        })
    }
}