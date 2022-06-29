package com.lac.preparcial.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lac.preparcial.R;

public class SecondaryActivity extends AppCompatActivity {

    private NavHostFragment navHostFragment;
    private BottomNavigationView bottomBar;

    @NonNull
    @Override
    public FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        setTitle("Home");

        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host);
        bottomBar = findViewById(R.id.bottom_bar);

        NavigationUI.setupWithNavController(bottomBar, navHostFragment.getNavController());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = new MenuInflater(getApplicationContext());
        inflater.inflate(R.menu.secondary_menu, menu);

        return super.onCreateOptionsMenu(menu);

    }
}