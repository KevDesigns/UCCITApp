package com.example.uccitapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.uccitapp.*


class MainActivity : AppCompatActivity() {
    private val mail: String = "ithod@ucc.edu.jm"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val directory: ImageButton = findViewById(R.id.ibDir)
        directory.setOnClickListener {
            val intent = Intent(this, Directory::class.java)
            startActivity(intent)
        }

        val mediabtn: ImageButton = findViewById(R.id.ibSocials)
        mediabtn.setOnClickListener{
            val intent = Intent(this, Media::class.java)
            startActivity(intent)
        }

        val coursebtn: ImageButton = findViewById(R.id.ibCourses)
        coursebtn.setOnClickListener{
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }

        val admission: ImageButton = findViewById(R.id.ibAdmission)
        admission.setOnClickListener {
            val intent = Intent(this, Admissions::class.java)
            startActivity(intent)
        }

        val schedulebtn: ImageButton = findViewById(R.id.ibSchedule)
        schedulebtn.setOnClickListener{
            val intent = Intent(this, Timetable::class.java)
            startActivity(intent)
        }

        val sendEmail: FloatingActionButton = findViewById(R.id.fabEmail)
        sendEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mail, null))
            intent.putExtra(Intent.EXTRA_EMAIL, mail)
            startActivity(intent)
        }
    }
}