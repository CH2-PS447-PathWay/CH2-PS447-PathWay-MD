package com.fadhlalhafizh.pathway.app.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.fadhlalhafizh.pathway.R
import com.fadhlalhafizh.pathway.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        // Tidak menggunakan AppBarConfiguration karena kita tidak ingin ActionBar
        // val appBarConfiguration = AppBarConfiguration(setOf(
        //     R.id.navigation_home, R.id.navigation_university, R.id.navigation_profession, R.id.navigation_goals))

        // Menghilangkan setupActionBarWithNavController
        // setupActionBarWithNavController(navController, appBarConfiguration)

        // Setup BottomNavigationView dengan NavController
        navView.setupWithNavController(navController)
    }
}
