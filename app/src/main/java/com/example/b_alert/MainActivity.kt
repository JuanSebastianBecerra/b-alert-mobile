package com.example.b_alert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonIngresarClick = findViewById<Button>(R.id.button_ingresar)
        buttonIngresarClick.setOnClickListener {
            val intent = Intent(this, ListAlarm::class.java)
            startActivity(intent)
        }

    }
}