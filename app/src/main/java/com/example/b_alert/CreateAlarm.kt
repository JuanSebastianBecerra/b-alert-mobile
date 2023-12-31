package com.example.b_alert

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class CreateAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alarm)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        createToneSpinner();
        createReplaySpinner()
        createConfigurationSpinner()

        val buttonCancelClick = findViewById<ImageButton>(R.id.imageButtonCancel)
        buttonCancelClick.setOnClickListener {
            val intent = Intent(this, ListAlarm::class.java)
            startActivity(intent)
        }

        val buttonSaveClick = findViewById<ImageButton>(R.id.imageButtonSave)
        buttonSaveClick.setOnClickListener {
            val intent = Intent(this, ListAlarm::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun createToneSpinner(){
        val spinner: Spinner = findViewById(R.id.spinnerTone)
        ArrayAdapter.createFromResource(
            this,
            R.array.tone_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    private fun createReplaySpinner(){
        val spinner: Spinner = findViewById(R.id.spinnerReplay)
        ArrayAdapter.createFromResource(
            this,
            R.array.replay_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    private fun createConfigurationSpinner(){
        val spinner: Spinner = findViewById(R.id.spinnerConfigurations)
        ArrayAdapter.createFromResource(
            this,
            R.array.configuration_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    private fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return this.let {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.default_configuration)
                .setItems(R.array.configuration_array,
                    DialogInterface.OnClickListener { dialog, which ->
                        // The 'which' argument contains the index position
                        // of the selected item
                    })
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

}