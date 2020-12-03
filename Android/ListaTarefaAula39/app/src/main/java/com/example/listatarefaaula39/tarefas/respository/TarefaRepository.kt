package com.example.listatarefaaula39.tarefas.respository

import com.example.listatarefaaula39.tarefas.dao.TarefaDao
import com.example.listatarefaaula39.tarefas.models.Tarefa

class TarefaRepository(private val tarefaDao: TarefaDao) {

    suspend fun addTarefa(tarefa: Tarefa) = tarefaDao.addTarefa(tarefa)

    suspend fun getTarefas() = tarefaDao.getTarefas()
}