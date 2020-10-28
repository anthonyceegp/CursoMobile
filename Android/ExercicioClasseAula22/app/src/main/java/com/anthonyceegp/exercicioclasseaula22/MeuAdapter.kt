package com.anthonyceegp.exercicioclasseaula22

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val dataSet: List<Conversa>):RecyclerView.Adapter<MeuAdapter.MeuViewHolder>(){

    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val txtNome: TextView = view.findViewById(R.id.txtNome)
        private val txtMensagem: TextView = view.findViewById(R.id.txtMensagem)
        private val txtHora: TextView = view.findViewById(R.id.txtHora)

        fun bind(conversa: Conversa) {
            txtNome.text = conversa.nome
            txtMensagem.text = conversa.ultimaMensagem
            txtHora.text = conversa.hora
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return MeuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}