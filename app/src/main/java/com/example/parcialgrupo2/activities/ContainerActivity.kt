package com.example.parcialgrupo2.activities

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.preference.PreferenceManager
import com.example.parcialgrupo2.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class ContainerActivity : AppCompatActivity() {
    private lateinit var bottomNavView: BottomNavigationView
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navView: NavigationView
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.bottom_nav_host_fragment) as NavHostFragment
        bottomNavView = findViewById(R.id.bottom_nav_view)

        NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)



        navHostFragment.navController.addOnDestinationChangedListener { _, _, _ ->
            supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_launcher_foreground)
        }

        drawerLayout = findViewById(R.id.drawer_layout_id)

        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(),
            fallbackOnNavigateUpListener = ::onSupportNavigateUp
        )

        NavigationUI.setupActionBarWithNavController(
            this,
            navHostFragment.navController,
            drawerLayout
        )

        navView = findViewById(R.id.nav_view)
        navView.setupWithNavController(navHostFragment.navController)
    }

    override fun onStart() {
        super.onStart()
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        Log.d("Test", prefs.getBoolean("switch_preference", true).toString())
    }

    override fun onSupportNavigateUp(): Boolean {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.bottom_bar, menu)
        return true
    }
}