package com.example.aplicacionparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondActivity : AppCompatActivity() {

    lateinit var fcvHome: NavHostFragment
    lateinit var bnvHome: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        fcvHome = supportFragmentManager.findFragmentById(R.id.fcvHome) as NavHostFragment
        bnvHome=findViewById(R.id.bnvHome)
        NavigationUI.setupWithNavController(bnvHome,fcvHome.navController )
    }


}