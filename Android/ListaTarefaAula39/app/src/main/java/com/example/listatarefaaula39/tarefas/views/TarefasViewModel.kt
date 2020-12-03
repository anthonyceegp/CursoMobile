package com.example.listatarefaaula39.tarefas.views

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.listatarefaaula39.tarefas.models.Tarefa
import com.example.listatarefaaula39.tarefas.respository.TarefaRepository
import kotlinx.coroutines.Dispatchers

class TarefasViewModel(
    private val repository: TarefaRepository
) : ViewModel() {

    fun addTarefa(tarefa: Tarefa) = liveData(Dispatchers.IO) {
        repository.addTarefa(tarefa)
        emit(true)
    }

    fun getTarefas() = liveData(Dispatchers.IO) {
        val tarefas = repository.getTarefas()
        emit(tarefas)
    }

    @Suppress("UNCHECKED_CAST")
    class TarefasViewModelFactory(
        private val repository: TarefaRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return TarefasViewModel(repository) as T
        }

    }
}