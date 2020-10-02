package aula11.ex7

fun main() {
    val calculoMatemativo = CalculoMatematico()
    try {
        calculoMatemativo.divisao(4, 0)
    } catch (e: ArithmeticException) {
        println(e.message)
        e.printStackTrace()
    }

}