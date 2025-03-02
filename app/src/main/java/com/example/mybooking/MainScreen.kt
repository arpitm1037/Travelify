package com.example.mybooking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mybooking.Cabs
import com.example.mybooking.Flights
import com.example.mybooking.Hotels
import com.example.mybooking.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainScreen : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)


        bottomNavigationView = findViewById(R.id.mynav)

        val default = supportFragmentManager.beginTransaction()

        default.replace(R.id.myfrag, Hotels()).commit()


        bottomNavigationView.setOnItemSelectedListener { item ->
            val transaction = supportFragmentManager.beginTransaction()

            when (item.itemId) {

                R.id.hotels -> transaction.replace(R.id.myfrag, Hotels()).commit()

                R.id.flights -> transaction.replace(R.id.myfrag, Flights()).commit()

                R.id.cabs -> transaction.replace(R.id.myfrag, Cabs()).commit()
            }

            true
        }
    }
}

