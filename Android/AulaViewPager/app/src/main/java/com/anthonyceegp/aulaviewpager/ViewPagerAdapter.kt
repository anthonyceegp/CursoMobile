package com.anthonyceegp.aulaviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter( private val fragments: List<Fragment>,
                        private val titulos: List<String>,
                        manager: FragmentManager): FragmentPagerAdapter(manager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    //Quantidade de tabs
    override fun getCount() = fragments.size

    //Retorna o fragment correspondente à posição
    override fun getItem(position: Int) = fragments[position]

    //Retorna o nome da tab
    override fun getPageTitle(position: Int) = titulos[position]
}