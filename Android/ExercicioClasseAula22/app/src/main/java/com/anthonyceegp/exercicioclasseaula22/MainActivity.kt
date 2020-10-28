package com.anthonyceegp.exercicioclasseaula22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val recycler by lazy { findViewById<RecyclerView>(R.id.minhaLista) }
    private val manager by lazy { LinearLayoutManager(this) }

    private val conversas by lazy {
        arrayListOf(
            Conversa(
                "Anthony",
                "Ei quanto tempo, queria marcar uma rolê pra gente conversar",
                "11:00"
            ),
            Conversa(
                "Carlos",
                "Bom dia!!",
                "11:00"
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.apply {
            layoutManager = manager
            adapter = MeuAdapter(conversas)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}