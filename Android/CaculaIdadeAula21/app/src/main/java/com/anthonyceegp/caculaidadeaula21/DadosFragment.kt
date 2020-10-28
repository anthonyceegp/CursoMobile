package com.anthonyceegp.caculaidadeaula21

import android.content.Context
import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi

class DadosFragment : Fragment() {
    private lateinit var activity: IMostraResultado
    private lateinit var edtNome: EditText
    private lateinit var edtAnoNasc: EditText
    private lateinit var btnCalcular: Button

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dados, container, false)

        edtNome = view.findViewById(R.id.edtNome)
        edtAnoNasc = view.findViewById(R.id.edtAnoNasc)
        btnCalcular = view.findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            if (validarEntradas()) {
                val idade = Calendar.getInstance().get(Calendar.YEAR) - edtAnoNasc.text.toString().toInt()
                val nome = edtNome.text.trim()
                val resultado: String

                resultado = if (idade < 0) {
                    "$nome ainda não nasceu"
                } else {
                    "$nome, você tem $idade " + if (idade > 1) {"anos"} else {"ano"}
                }

                activity.mostrarResultado(resultado)
            }
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as IMostraResultado
    }

    private fun validarEntradas(): Boolean {
        var resultado = true

        if (edtNome.text.isBlank()) {
            edtNome.error = "Nome não pode ser vazio"
            resultado = false
        }

        if (edtAnoNasc.text.isBlank()) {
            edtAnoNasc.error = "Ano de nascimento não pode ser vazio"
            resultado = false
        }

        return resultado
    }
}