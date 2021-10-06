package com.ingenieriaentecnologias.androitrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pregunta3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta3)
        val goButton =findViewById<Button>(R.id.go_button3)
        goButton.setOnClickListener(){
            val intent = Intent (this, resultadofinal::class.java)
            startActivity(intent)
        }
    }
}