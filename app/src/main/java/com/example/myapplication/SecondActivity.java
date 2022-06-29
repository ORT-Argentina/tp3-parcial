package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SecondActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bottomNavBar = findViewById(R.id.bottomNavigationView);


        bottomNavBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.homeFragment:
                        ft.replace(R.id.fragmentContainerView, new homeFragment()).commit();
                        return true;

                    case R.id.otherScreenFragment:
                        ft.replace(R.id.fragmentContainerView, new otherScreenFragment()).commit();
                        return true;

                }
                return false;
            }
        });

        FragmentManager fm = getSupportFragmentManager();
        NavHostFragment navHostFragment = (NavHostFragment) fm.findFragmentById(R.id.nav_host);
        bottomNavBar = findViewById(R.id.bottomNavigationView);
        NavigationUI.setupWithNavController(bottomNavBar, navHostFragment.getNavController());

    }

}