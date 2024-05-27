package com.example.veterinariaayon

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinariaayon.databinding.ActivityRegistroCaballoBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class CalendarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroCaballoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroCaballoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calendario = Calendar.getInstance()
        val fecha = DatePickerDialog.OnDateSetListener {datepicker, year,month,day->
            calendario.set(Calendar.YEAR,year)
            calendario.set(Calendar.MONTH,month)
            calendario.set(Calendar.DAY_OF_MONTH,day)

            actualizarFecha(calendario)
        }

        binding.btnCalendario.setOnClickListener {
            DatePickerDialog(
                this,
                fecha,
                calendario.get(Calendar.YEAR),
                calendario.get(Calendar.MONTH),
                calendario.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
    }

    private fun actualizarFecha(calendar: Calendar){
        val formatoFecha = "dd-MM-YYYY"
        val formatoSimple = SimpleDateFormat(formatoFecha, Locale.ENGLISH)
        binding.btnCalendario.text = formatoSimple.format(calendar.time)
    }

}