package com.example.uccitapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TimeTableDetails : AppCompatActivity() {
    private lateinit var abtn:Button
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_table_details)

        abtn = findViewById(R.id.abtn)
        abtn.setOnClickListener{
            val intent = Intent(this, Timetable::class.java)
            startActivity(intent)
        }

        val index: String? = this.intent.getStringExtra("listIndex1")

        val day: TextView = findViewById(R.id.tvDay)
        val course: TextView = findViewById(R.id.tvCourses)
        val time: TextView = findViewById(R.id.tvTime)

        when (index) {
            "0" -> {
                day.text = "Sunday"
                course.text = "Object Oriented Programming Using C++"
                time.text = "6:00pm - 8:00pm"

            }

            "1" -> {
                day.text = "Sunday"
                course.text = "Internet Authoring I"
                time.text = "8:00am - 10:00am"
            }

            "2" -> {
                day.text = "Monday"
                course.text = "Programming Techniques"
                time.text = "6:00pm - 8:00pm"
            }

            "3" -> {
                day.text = "Tuesday"
                course.text = "Computer Essentials & Troubleshooting"
                time.text = "8:00pm - 10:00pm"
            }

            "4" -> {
                day.text = "Wednesday"
                course.text = "Fundamentals of Computer Graphics Design"
                time.text = "6:00pm - 8:00pm"
            }

            "5" -> {
                day.text = "Wednesday"
                course.text = "Database Management Systems"
                time.text = "8:00pm - 10:00pm"
            }

            "6" -> {
                day.text = "Thursday"
                course.text = "Mobile Application Development"
                time.text = "6:00pm - 8:00pm"
            }

            "7" -> {
                day.text = "Friday"
                course.text = "Computer Data Analysis"
                time.text = "8:00pm - 10:00pm"
            }

            "8" -> {
                day.text = "Saturday"
                course.text = "Discrete Mathematics I"
                time.text = "4:00pm - 6:00pm"
            }

            "9" -> {
                day.text = "Saturday"
                course.text = "Data Communications and Networks"
                time.text = "6:00pm - 8:00pm"
            }

            "10" -> {
                day.text = "Saturday"
                course.text = "Programming Design Using Java"
                time.text = "8:00pm - 10:00pm"
            }


        }
    }
        }

