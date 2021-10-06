package com.ingenieriaentecnologias.androitrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pregunta1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta1)
        val goButton =findViewById<Button>(R.id.go_button1)
        goButton.setOnClickListener(){
            val intent = Intent (this, Pregunta2::class.java)
            startActivity(intent)
        }
    }
}