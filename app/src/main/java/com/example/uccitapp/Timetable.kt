package com.example.uccitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Timetable : AppCompatActivity() {
    private  lateinit var cbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timetable)

        val timeList: Array<String> = resources.getStringArray(R.array.time)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timeList)

        val listView1: ListView = findViewById(R.id.lvTimeTable)
        listView1.adapter = adapter

        listView1.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked item : "+position, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, TimeTableDetails::class.java)
            intent.putExtra("listIndex1", position.toString())
            this.startActivity(intent)
        }

        cbtn = findViewById(R.id.cbtn)
        cbtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}