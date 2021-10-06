package com.ingenieriaentecnologias.androitrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val goButton =findViewById<Button>(R.id.lests_button)
        goButton.setOnClickListener(){
            val intent = Intent (this, Pregunta1::class.java)
            startActivity(intent)
        }
    }
}