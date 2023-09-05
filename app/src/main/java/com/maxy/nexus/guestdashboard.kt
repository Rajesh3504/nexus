package com.maxy.nexus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.maxy.nexus.maps.canteenmaps

class guestdashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guestdashboard)


        val guestklu=findViewById<CardView>(R.id.guestklu)
        guestklu.setOnClickListener{
            val intent = Intent(this, Gklu::class.java)
            startActivity(intent)
        }
        val guestcanteen=findViewById<CardView>(R.id.guestcanteen)
        guestcanteen.setOnClickListener{
            val intent = Intent(this, canteenmaps::class.java)
            startActivity(intent)
        }

    }
}