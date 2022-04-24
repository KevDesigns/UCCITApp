package com.example.uccitapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Details : AppCompatActivity() {
    private lateinit var bACKbtn: Button
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        bACKbtn = findViewById(R.id.bACKbtn)
        bACKbtn.setOnClickListener{
            val intent = Intent(this, Directory::class.java)
            startActivity(intent)
        }

        val index: String? = this.intent.getStringExtra("listIndex")

        val name: TextView = findViewById(R.id.tvName)
        val email: TextView = findViewById(R.id.tvEmail)
        val photo: ImageView = findViewById(R.id.ivProfile)
        val phone: TextView = findViewById(R.id.tvPhone)

        when(index){
            "0" -> {
                name.text = "ROSE, Natalie"
                email.text = "ithod@ucc.edu.jm"
                phone.text = "876-627-2819"
                photo.setImageResource(R.drawable.rose)
            }
            "1" -> {
                name.text = "DAVIDSON, Sonia"
                email.text = "businessadminhod@ucc.edu.jm"
                phone.text = "876-356-4746"
                photo.setImageResource(R.drawable.davidson)
            }
            "2" -> {
                name.text = "AMONDE, Tom"
                email.text = "graduatestudiesdirector@ucc.edu.jm"
                phone.text = "876-668-7753"
                photo.setImageResource(R.drawable.amonde)
            }
            "3" -> {
                name.text = "MILLER, Ionie"
                email.text = "appliedpsychologyfaculty@ucc.edu.jm"
                phone.text = "876-263-5475"
                photo.setImageResource(R.drawable.miller)
            }
            "4" -> {
                name.text = "NDAJAH, Peter"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                phone.text = "876-647-3645"
                photo.setImageResource(R.drawable.ndajah)
            }
            "5" -> {
                name.text = "SEYMOUR, Ian"
                email.text = "itlecturer3@ucc.edu.jm"
                phone.text = "876-906-3000"
                photo.setImageResource(R.drawable.ndajah)
            }
            "6" -> {
                name.text = "WILLIAMS, Neil"
                email.text = "itlecturer@ucc.edu.jm"
                phone.text = "876-906-3000"
                photo.setImageResource(R.drawable.ndajah)
            }
        }

    }

}