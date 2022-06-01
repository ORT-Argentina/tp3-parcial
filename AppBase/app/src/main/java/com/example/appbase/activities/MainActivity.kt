package com.example.appbase.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.appbase.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var nav_view: NavigationView
    lateinit var drawer_layout_id: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var bottomNavView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = intent.extras
        val email = bundle?.getString("Email")



        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        nav_view = findViewById(R.id.nav_view)
        drawer_layout_id = findViewById(R.id.drawer_layout_id)

        nav_view.setupWithNavController(navController)


        appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(),
            fallbackOnNavigateUpListener = ::onSupportNavigateUp
        )

        setupActionBarWithNavController(navController, appBarConfiguration)

        navController.addOnDestinationChangedListener { _, _, _ ->
            supportActionBar?.setHomeAsUpIndicator(R.drawable.hamburger)
        }

       bottomNavView = findViewById(R.id.bottom_bar)
        NavigationUI.setupWithNavController(bottomNavView, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        if (drawer_layout_id.isDrawerOpen(GravityCompat.START)) {
            drawer_layout_id.closeDrawer(GravityCompat.START)
        } else {
            drawer_layout_id.openDrawer(GravityCompat.START)
        }
        return false
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        //menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

}