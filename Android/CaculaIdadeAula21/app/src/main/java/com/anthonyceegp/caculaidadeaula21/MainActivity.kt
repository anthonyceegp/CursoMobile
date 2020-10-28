package com.anthonyceegp.caculaidadeaula21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), IMostraResultado {

    private val dadosFragment by lazy { DadosFragment() }
    private val resultadoFragment by lazy { ResultadoFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.containerDados, dadosFragment)
        transaction.commit()

        transaction = manager.beginTransaction()
        transaction.replace(R.id.containerResultado, resultadoFragment)
        transaction.commit()
    }

    override fun mostrarResultado(resultado: String) {
        resultadoFragment.mostrarResultado(resultado)
    }
}