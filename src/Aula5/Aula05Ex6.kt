package Aula5

fun main() {
    print("Qual o número deseja ver a tabuada? ")
    val numeroTabuada = readLine()!!.toInt()
    println("Tabuada de $numeroTabuada:")
    for (i in 1..10) {
        println("$numeroTabuada x $i = ${numeroTabuada * i}")
    }
}