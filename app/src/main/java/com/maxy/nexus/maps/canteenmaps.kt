package com.maxy.nexus.maps

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.maxy.nexus.R
import com.maxy.nexus.maps.canteens.chocolateroom
import com.maxy.nexus.maps.canteens.kladda
import com.maxy.nexus.maps.canteens.maincanteen
import com.maxy.nexus.maps.canteens.rndcanteen
import com.maxy.nexus.maps.canteens.satishcanteen
import java.net.URL
import java.net.URLConnection

class canteenmaps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canteenmaps)


        val mcanteen=findViewById<CardView>(R.id.maincanteen)
        mcanteen.setOnClickListener{
            val intent=Intent(this, maincanteen::class.java)
            startActivity(intent)
        }

        val croom=findViewById<CardView>(R.id.chocolateroom)
        croom.setOnClickListener {
            val intent=Intent(this,chocolateroom::class.java)
            startActivity(intent)
        }
        val adda=findViewById<CardView>(R.id.kladda)
        adda.setOnClickListener {
            val intent=Intent(this,kladda::class.java)
            startActivity(intent)
        }
        val ras=findViewById<CardView>(R.id.riceandspice)
        ras.setOnClickListener {
            val intent=Intent(this,ras::class.java)
            startActivity(intent)
        }
        val satish=findViewById<CardView>(R.id.satishcanteen)
        satish.setOnClickListener {
            val intent=Intent(this,satishcanteen::class.java)
            startActivity(intent)
        }
        val rnd=findViewById<CardView>(R.id.rndcanteen)
        rnd.setOnClickListener {
            val intent=Intent(this,rndcanteen::class.java)
            startActivity(intent)
        }
    }
}