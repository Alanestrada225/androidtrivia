package com.ingenieriaentecnologias.androitrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pregunta2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta2)
        val goButton =findViewById<Button>(R.id.go_button2)
        goButton.setOnClickListener(){
            val intent = Intent (this, pregunta3::class.java)
            startActivity(intent)
        }
    }
}