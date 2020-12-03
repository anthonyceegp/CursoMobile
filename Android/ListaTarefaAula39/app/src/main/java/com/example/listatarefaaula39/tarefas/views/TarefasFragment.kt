package com.example.listatarefaaula39.tarefas.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listatarefaaula39.R
import com.example.listatarefaaula39.db.AppDatabase
import com.example.listatarefaaula39.tarefas.models.Tarefa
import com.example.listatarefaaula39.tarefas.respository.TarefaRepository
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class TarefasFragment : Fragment() {
    private lateinit var viewModel: TarefasViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var tarefasAdapter: TarefasAdapter
    private lateinit var manager: LinearLayoutManager
    private var tarefas = mutableListOf<Tarefa>()

    private lateinit var nome: TextInputEditText
    private lateinit var nomeLayout: TextInputLayout
    private lateinit var botao: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tarefas_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nome = view.findViewById(R.id.input_nome)
        nomeLayout = view.findViewById(R.id.input_nome_layout)
        botao = view.findViewById(R.id.adicionar_button)

        recyclerView = view.findViewById(R.id.recycler_view)
        manager = LinearLayoutManager(this.context)
        tarefasAdapter = TarefasAdapter(tarefas)
        recyclerView.apply {
            layoutManager = manager
            adapter = tarefasAdapter
        }

        viewModel = ViewModelProvider(
            this,
            TarefasViewModel.TarefasViewModelFactory(
                TarefaRepository(AppDatabase.getDatabase(view.context).tarefaDao())
            )
        ).get(TarefasViewModel::class.java)

        viewModel.getTarefas().observe(viewLifecycleOwner, {
            tarefas.clear()
            tarefas.addAll(it)
            tarefasAdapter.notifyDataSetChanged()
        })

        botao.setOnClickListener {
            if (nome.text.isNullOrBlank()) {
                nomeLayout.error = getString(R.string.field_required)
            } else {
                val tarefa = Tarefa(0, nome.text.toString())
                viewModel.addTarefa(tarefa).observe(viewLifecycleOwner, {
                    if (it) {
                        tarefas.add(tarefa)
                        tarefasAdapter.notifyDataSetChanged()
                    }
                })
            }
        }
    }
}