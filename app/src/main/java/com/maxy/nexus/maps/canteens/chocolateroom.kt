package com.maxy.nexus.maps.canteens

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maxy.nexus.R

class chocolateroom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chocolateroom)

        var x:String = "K L Deemed To Be University, K L UNIVERSITY, Vaddeswaram, Andhra Pradesh"
        var y:String ="Chocolate Room, CSE main block, K L UNIVERSITY, Vaddeswaram, Andhra Pradesh"
        val uri: Uri = Uri.parse("https://www.google.com/maps/dir/" + x + "/"+ y )
        val intent = Intent(Intent.ACTION_VIEW, uri)
        intent.setPackage("com.google.android.apps.maps")
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }
}

//Chocolate Room, CSE main block, K L UNIVERSITY, Vaddeswaram, Andhra Pradesh