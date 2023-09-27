package com.example.b_alert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreateAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alarm)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }
}