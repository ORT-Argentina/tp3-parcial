package com.example.parcialtp3.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.viewpager2.widget.ViewPager2
import com.example.parcialtp3.R
import com.example.parcialtp3.adapters.ListadoTypesAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var bottomBar: BottomNavigationView
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTypesTabs()

        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerMain) as NavHostFragment
        bottomBar = findViewById(R.id.bottomNavMain)
        NavigationUI.setupWithNavController(bottomBar, navHostFragment.navController)
    }

    private fun setTypesTabs() {
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        var inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.bottom_nav_main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}