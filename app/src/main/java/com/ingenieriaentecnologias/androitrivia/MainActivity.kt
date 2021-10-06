package com.ingenieriaentecnologias.androitrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val goButton =findViewById<Button>(R.id.go_button)
        goButton.setOnClickListener(){
            val intent = Intent (this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}