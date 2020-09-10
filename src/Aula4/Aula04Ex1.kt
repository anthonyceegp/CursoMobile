package Aula4

fun main() {
    print("Digite a temperatura em graus Fahrenheit: ")
    val grausF = readLine()!!.toDouble()
    val grausC = 5 * ((grausF-32) / 9)
    print("Temperatura em graus Celsius: $grausC ºC")
}