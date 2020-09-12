package aula6
//Exercício 1 - Nível 1 - Aula 06

fun main() {
    val numberArray = arrayOfNulls<Int>(5)

    for (i in numberArray.indices) {
        print("Digite um número: ")
        numberArray[i] = readLine()!!.toInt()
    }
    println()
    numberArray.forEach { number -> println(number) }
}
