package com.anthonyceegp.calculosalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener() {
            val horas = edtHoras.text.toString().toDoubleOrNull()
            val valor = edtValor.text.toString().toDoubleOrNull()

            if (horas != null && valor != null) {
                txtResultado.text = getString(R.string.resultado, horas * valor)
            } else {
                txtResultado.text = getString(R.string.entrada_invalida)
            }
        }
    }
}