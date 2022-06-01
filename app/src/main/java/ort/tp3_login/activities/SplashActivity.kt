package ort.tp3_login.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import ort.tp3_login.R

class SplashActivity : AppCompatActivity() {

    companion object {
        //private const val SPLASH_TIME_OUT:Long = 2000
    }
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        button = findViewById(R.id.buttonIngresar)

        button.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }
}