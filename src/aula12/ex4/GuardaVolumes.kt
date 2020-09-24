package aula12.ex4

class GuardaVolumes {

    private val mapaDePecas = mutableMapOf<Int, MutableList<Peca>>()
    private var contador = 0

    fun guardarPecas(listaDePeca: MutableList<Peca>): Int {
        mapaDePecas[contador] = listaDePeca
        return contador++
    }

    fun mostrarPecas() {
        mapaDePecas.forEach {
            println("${it.key}: ${it.value}")
        }
    }

    fun mostrarPecas(numero: Int) {
        if (mapaDePecas.containsKey(numero)) {
            println(mapaDePecas[numero])
        } else {
            println("Não há peças associada ao número passado")
        }
    }

    fun devolverPecas(numero: Int) {
        if (mapaDePecas.containsKey(numero)) {
            mapaDePecas.remove(numero)
        } else {
            println("Não há peças associada ao número passado")
        }
    }
}