package aula12.ex3

class Prova {

    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>) {
        var total = 0
        val iterator = conjuntoDeInteiros.iterator()
        while (iterator.hasNext()) {
            total += iterator.next()
        }

        println("Total: $total")
    }
}