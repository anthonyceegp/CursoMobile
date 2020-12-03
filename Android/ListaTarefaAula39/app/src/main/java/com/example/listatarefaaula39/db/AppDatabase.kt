package com.example.listatarefaaula39.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.listatarefaaula39.tarefas.models.Tarefa
import com.example.listatarefaaula39.tarefas.dao.TarefaDao

@Database(
    entities = [Tarefa::class],
    version = 1,
    exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun tarefaDao(): TarefaDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "tarefas"
                ).build()
            }

            return INSTANCE!!
        }
    }
}