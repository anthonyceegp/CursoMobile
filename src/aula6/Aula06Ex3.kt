package aula6

//Exercício 3 - Nível 1 - Aula 06

fun main() {
    val heightArray = arrayOfNulls<Double>(5)

    for (i in heightArray.indices) {
        print("Type a height: ")
        heightArray[i] = readLine()!!.toDouble()
    }
    println()
    heightArray.reverse()
    heightArray.forEach { number -> println("%.2f".format(number)) }
}