package com.anthonyceegp.aulaviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tabLayout)

        tab.setupWithViewPager(pager)

        val fragments = listOf(
            MeuFragment(), MeuFragment(), MeuFragment()
        )

        val titulos = listOf(
            "Home", "Biblioteca", "Favoritos"
        )

        pager.adapter = ViewPagerAdapter(fragments, titulos, supportFragmentManager)
    }
}