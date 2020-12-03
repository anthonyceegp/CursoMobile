package com.example.listatarefaaula39

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listatarefaaula39.tarefas.views.TarefasFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, TarefasFragment())
            .commit()
    }
}