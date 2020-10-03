package com.anthonyceegp.exibenome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExibir.setOnClickListener() {
            val nome = edtNome.text
            txtResultado.text = getString(R.string.meu_nome_s, nome)
        }
    }
}