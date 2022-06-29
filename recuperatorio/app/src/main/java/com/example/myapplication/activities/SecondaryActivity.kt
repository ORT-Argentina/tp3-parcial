package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondaryActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView
    lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        navHost = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        bottomNav = findViewById(R.id.bottomNav)

        NavigationUI.setupWithNavController(bottomNav, navHost.navController)

    }
}