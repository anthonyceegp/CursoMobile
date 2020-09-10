package Aula4

fun main() {
    print("Digite a altura: ")
    val altura = readLine()!!.toDouble()

    val pesoIdealHomem = (72.7 * altura) - 58
    val pesoIdealMulher = (62.1 * altura) - 44.7

    print("\nPara homens: ${"%.2f".format(pesoIdealHomem)}")
    print("\nPara mulher: ${"%.2f".format(pesoIdealMulher)}")
}