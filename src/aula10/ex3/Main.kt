package aula10.ex3

fun main() {
    val estoque = Estoque("Maças",20)
    println(estoque.mostrar())
    println()

    estoque.repor(-10)
    println(estoque.mostrar())
    println()

    estoque.repor(10)
    println(estoque.mostrar())
    println()

    estoque.mudarNome("Bananas")
    println(estoque.mostrar())
    println()

    estoque.mudarQtdMinima(-10)
    println(estoque.mostrar())
    println()

    estoque.mudarQtdMinima(10)
    println(estoque.mostrar())
    println()

    estoque.darBaixa(20)
    println(estoque.mostrar())
    println()

    estoque.darBaixa(5)
    println(estoque.mostrar())
    println()

    println(estoque.precisaRepor())
    println()

    estoque.repor(10)
    println(estoque.precisaRepor())
    println()
}