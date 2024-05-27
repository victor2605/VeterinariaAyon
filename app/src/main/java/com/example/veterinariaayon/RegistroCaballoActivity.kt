package com.example.veterinariaayon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistroCaballoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_caballo)

        val btn: Button = findViewById(R.id.btn_calendario)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, CalendarioActivity::class.java)
            startActivity(intent)
        }
    }
}