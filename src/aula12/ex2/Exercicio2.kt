package aula12.ex2

fun main() {
    val list = mutableListOf<Int>()
    list.add(1)
    list.add(5)
    list.add(5)
    list.add(6)
    list.add(7)
    list.add(8)
    list.add(8)
    list.add(8)

    println(list)

    val conjunto = mutableSetOf<Int>()
    conjunto.add(1)
    conjunto.add(5)
    conjunto.add(5)
    conjunto.add(6)
    conjunto.add(7)
    conjunto.add(8)
    conjunto.add(8)
    conjunto.add(8)

    println(conjunto)

    println()

    list.forEach {
        println("$it")
    }

    println()

    conjunto.forEach {
        println("$it")
    }

}