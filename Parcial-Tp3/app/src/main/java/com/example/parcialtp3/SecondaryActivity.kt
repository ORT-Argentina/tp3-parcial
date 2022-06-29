package com.example.parcialtp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

private lateinit var navHostFragment: NavHostFragment
private lateinit var bottomBar: BottomNavigationView

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        title = "Listado disponible"

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment

        bottomBar = findViewById(R.id.bottom_bar)

        NavigationUI.setupWithNavController(bottomBar, navHostFragment.navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.buscar_menu, menu)
        return true
    }
}