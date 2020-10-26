package com.anthonyceegp.transicaoentrefragmentsaula21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    private lateinit var manager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager

        val fragmentA = AFragment()
        val fragmentB = BFragment()

        val btnExibeFragmentA = findViewById<Button>(R.id.btnExibeFragmentA)
        val btnExibeFragmentB = findViewById<Button>(R.id.btnExibeFragmentB)

        btnExibeFragmentA.setOnClickListener {
            replaceFragment(fragmentA)
        }

        btnExibeFragmentB.setOnClickListener {
            replaceFragment(fragmentB)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }
}