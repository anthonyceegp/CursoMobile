package com.example.contador.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel: ViewModel() {

    var contador = MutableLiveData<Int>(0)

    fun incrementar() {
        contador.value = contador.value!! + 1
    }
}