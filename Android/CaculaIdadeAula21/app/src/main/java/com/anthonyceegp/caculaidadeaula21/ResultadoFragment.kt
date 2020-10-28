package com.anthonyceegp.caculaidadeaula21

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ResultadoFragment : Fragment() {
    private lateinit var activity: IMostraResultado
    private lateinit var txtResultado: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_resultado, container, false)
        txtResultado = view.findViewById<TextView>(R.id.txtResultado)
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as IMostraResultado
    }

    fun mostrarResultado(resultado: String) {
        txtResultado.text = resultado
    }
}