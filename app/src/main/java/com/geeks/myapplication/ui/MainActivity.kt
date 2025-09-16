package com.geeks.myapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.geeks.myapplication.ui.main.MainFragment
import com.geeks.myapplication.R
import com.geeks.myapplication.utils.Prefs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_controller) as NavHostFragment
        val navController = navHostFragment.navController
        val navGraph = navController.navInflater.inflate(R.navigation.nav_host)

        if (Prefs.isOnBoardShown(this)) {
            navGraph.setStartDestination(R.id.notesFragment)
        } else {
            navGraph.setStartDestination(R.id.onBoardFragment)
        }
        navController.graph = navGraph
    }

}