package com.example.uccitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton

class Media : AppCompatActivity() {
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media)

        btn = findViewById(R.id.btn)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val web2: ImageButton = findViewById(R.id.imgFacebook)
        web2.setOnClickListener {
            val intent = Intent(this, Social2::class.java)
            startActivity(intent)
        }

        val web3: ImageButton = findViewById(R.id.imgTwitter)
        web3.setOnClickListener {
            val intent = Intent(this, Social3::class.java)
            startActivity(intent)
        }

        val web: ImageButton = findViewById(R.id.imgInstagram)
        web.setOnClickListener {
            val intent = Intent(this, Social::class.java)
            startActivity(intent)
        }

    }

        }
