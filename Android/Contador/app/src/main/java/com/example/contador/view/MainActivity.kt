package com.example.contador.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.contador.R

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ContadorViewModel

    private val texto by lazy { findViewById<TextView>(R.id.txtTexto) }
    private val botao by lazy { findViewById<Button>(R.id.btnAdicionar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(
            this,
            ContadorViewModelFactory()
        ).get(ContadorViewModel::class.java)

        botao.setOnClickListener {
            viewModel.incrementar()
        }

        viewModel.contador.observe(this, Observer<Int> {
            texto.text = it.toString()
        })
    }
}