package com.maxy.nexus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.maxy.nexus.maps.canteenmaps


class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_search
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_search -> return@setOnItemSelectedListener true
                R.id.bottom_settings -> {
                    startActivity(Intent(applicationContext, settings::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_profile -> {
                    startActivity(Intent(applicationContext, profile::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }

        val cardlms=findViewById<CardView>(R.id.cardlms)
        cardlms.setOnClickListener{
            val intent = Intent(this, lms::class.java)
            startActivity(intent)
        }
        val carderp=findViewById<CardView>(R.id.carderp)
        carderp.setOnClickListener{
            val intent = Intent(this, erp::class.java)
            startActivity(intent)
        }

        val crt=findViewById<CardView>(R.id.crt)
        crt.setOnClickListener{
            val intent = Intent(this, beingzero::class.java)
            startActivity(intent)
        }
        val canteens=findViewById<CardView>(R.id.canteens)
        canteens.setOnClickListener{
            val intent = Intent(this, canteenmaps::class.java)
            startActivity(intent)
        }

    }
}