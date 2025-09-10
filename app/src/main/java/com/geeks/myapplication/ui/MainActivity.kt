package com.geeks.myapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geeks.myapplication.ui.main.MainFragment
import com.geeks.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//         supportFragmentManager.beginTransaction().replace(R.id.container, MainFragment()).commit()
    }
}