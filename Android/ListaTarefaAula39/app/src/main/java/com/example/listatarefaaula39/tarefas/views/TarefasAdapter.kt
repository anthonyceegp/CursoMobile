package com.example.listatarefaaula39.tarefas.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listatarefaaula39.R
import com.example.listatarefaaula39.tarefas.models.Tarefa

class TarefasAdapter(
    private val tarefas: List<Tarefa>
) : RecyclerView.Adapter<TarefasAdapter.TarefaViewHoder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHoder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_tarefas, parent, false)

        return TarefaViewHoder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHoder, position: Int) {
        val tarefa = tarefas[position]

        holder.bind(tarefa)
    }

    override fun getItemCount() = tarefas.size

    class TarefaViewHoder(view: View) : RecyclerView.ViewHolder(view) {
        private val nomeTarefa = view.findViewById<TextView>(R.id.nome_tarefa)

        fun bind(tarefa: Tarefa) {
            nomeTarefa.text = tarefa.nome
        }
    }
}