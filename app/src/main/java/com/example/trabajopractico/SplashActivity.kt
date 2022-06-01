package com.example.trabajopractico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.trabajopractico.ui.login.LoginActivity


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val info: Button = findViewById(R.id.ingresarButton)
        info.setOnClickListener(View.OnClickListener { v ->
            val intent = Intent(v.context, LoginActivity::class.java)
            startActivityForResult(intent, 0)
        })
    }


}