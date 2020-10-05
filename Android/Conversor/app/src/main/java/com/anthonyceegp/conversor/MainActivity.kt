package com.anthonyceegp.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener() {
            val temperaturaCel = edtTemperatura.text.toString().toDoubleOrNull()
            if (temperaturaCel != null) {
                val temperaturaFah = ((temperaturaCel * 9) / 5) + 32
                txtResultado.text = getString(R.string.resultado, temperaturaFah)
            } else {
                txtResultado.text = getString(R.string.entrada_invalida)
            }
        }
    }
}