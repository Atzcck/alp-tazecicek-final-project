package com.alptazecicek.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Status bar hide.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN, // will look deprecated.
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Navigation bar initialize.
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView)
        NavigationUI.setupWithNavController(bottomNavigationView,navController)
    }
}