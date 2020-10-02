package aula4

import kotlin.math.max

fun main() {
    print("Digite o peso dos peixes: ")
    val pesoPeixes = readLine()!!.toDouble()

    val pesoRegulamento = 50.000
    val multaPorQuilo = 4.00

    val pesoExcendente = max(pesoPeixes - pesoRegulamento, 0.000)
    val multa = pesoExcendente * multaPorQuilo

    print("\nExcedeu ${"%.3f".format(pesoExcendente)}Kg")
    print("\nO Valor a ser pago é de R$ ${"%.2f".format(multa)}")
}