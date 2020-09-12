package aula4

fun main() {
    print("Quanto vale sua hora? ")
    val ganhoPorHora = readLine()!!.toDouble()

    print("Quantas horas você trabalhou? ")
    val horasTrabalhadas = readLine()!!.toDouble()

    val salarioBruto = ganhoPorHora * horasTrabalhadas

    print("\nVocê receberá R$ ${"%.2f".format(salarioBruto)}")
}