package aula7.ex4

fun main() {
    val carro = Carro(10)
    carro.adicionarGasolina(3.0)

    carro.andar(30.0)
    println()
    carro.obterGasolina()
}