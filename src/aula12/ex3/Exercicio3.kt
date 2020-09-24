package aula12.ex3

fun main() {
    val conjunto = mutableSetOf<Int>(1,2,3,5,5,6,6,7,7,7,7,1,1,2)
    val prova = Prova()

    conjunto.forEach {
        println(it)
    }
    println("---------")
    prova.somaTotal(conjunto)
}