package com.example.samplescroll

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var titleText: TextView
    private lateinit var headerText: TextView
    private lateinit var descriptionText: TextView
    private lateinit var userInput: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleText = findViewById(R.id.titleText)
        headerText = findViewById(R.id.headerText)
        descriptionText = findViewById(R.id.descriptionText)
    }
}
