package com.example.veterinariaayon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val btn: Button = findViewById(R.id.btn_caballo)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, RegistroCaballoActivity::class.java)
            startActivity(intent)

            val btn: Button = findViewById(R.id.btn_vaca)
            btn.setOnClickListener {

                val intent: Intent = Intent(this, RegistroVacaActivity::class.java)
                startActivity(intent)

            }
        }
    }
}