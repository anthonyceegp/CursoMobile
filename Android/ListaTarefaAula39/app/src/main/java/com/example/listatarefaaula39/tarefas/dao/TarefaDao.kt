package com.example.listatarefaaula39.tarefas.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.listatarefaaula39.tarefas.models.Tarefa

@Dao
interface TarefaDao {

    @Insert
    suspend fun addTarefa(tarefa: Tarefa)

    @Query("SELECT * FROM Tarefa")
    suspend fun getTarefas(): List<Tarefa>
}