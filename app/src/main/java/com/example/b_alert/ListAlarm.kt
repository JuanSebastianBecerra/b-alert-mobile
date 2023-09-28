package com.example.b_alert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ListAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alarm)

        val buttonLogoutClick = findViewById<ImageButton>(R.id.button_logout)
        buttonLogoutClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val buttonAddClick = findViewById<ImageButton>(R.id.button_add)
        buttonAddClick.setOnClickListener {
            val intent = Intent(this, CreateAlarm::class.java)
            startActivity(intent)
        }


    }
}