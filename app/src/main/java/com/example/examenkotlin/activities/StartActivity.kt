package com.example.examenkotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.examenkotlin.R
import com.google.android.material.navigation.NavigationView

class StartActivity : AppCompatActivity() {

    private lateinit var toolbar : Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var toogle: ActionBarDrawerToggle //Boton hamburguesa
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration // SETTINGS HAMBURGUER

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        toolbar = findViewById(R.id.main_toolbar)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setDisplayShowTitleEnabled(true)
        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_view)

        navController = Navigation.findNavController(this,R.id.nav_host_fragment)

        navigationView.setupWithNavController(navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

        toogle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.open_nav_drawer,
            R.string.close_nav_drawer
        )

        //APPBAR SETTINGS
        appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf()
        )

        setupActionBarWithNavController(navController, appBarConfiguration)

        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawerLayout)
    }

}