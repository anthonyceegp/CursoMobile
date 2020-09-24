package aula12.desafioEmAula

import kotlin.random.Random

fun main() {

    val pessoas = mutableListOf<Pessoa>()

    for (i in 0..100) {
        val estado = Estado.getEstados()[Random.nextInt(0,27)]
        pessoas.add(Pessoa("Pessoa $i",estado))
    }

    /*val mapPessoas= mutableMapOf<String,MutableList<Pessoa>>()
    pessoas.forEach {
        if (!mapPessoas.containsKey(it.estado.sigla)) {
            mapPessoas[it.estado.sigla] = mutableListOf()
        }

        mapPessoas[it.estado.sigla]?.add(it)
    }*/

    val mapPessoas = pessoas.groupByTo(mutableMapOf()) { it.estado.sigla }

    println("Número de chaves: ${mapPessoas.keys.size}")
    mapPessoas.forEach{(key, value) ->
        println("$key (${value.size}): $value")
    }
}