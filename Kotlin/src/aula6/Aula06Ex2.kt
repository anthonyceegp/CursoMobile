package aula6

//Exercício 2 - Nível 1 - Aula 06

fun main() {
    val numberArray = arrayOfNulls<Int>(10)

    for (i in numberArray.indices) {
        print("Digite um número: ")
        numberArray[i] = readLine()!!.toInt()
    }
    println()
    numberArray.reverse()
    numberArray.forEach { number -> println(number) }
}