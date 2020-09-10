package Aula5

fun main() {
    var contador = 0

    print("Telefonou para a vítima? ")
    val resposta1 = readLine()
    if(resposta1.equals("S",ignoreCase = true)) {
        contador++
    }

    print("Esteve no local do crime? ")
    val resposta2 = readLine()
    if(resposta2.equals("S",ignoreCase = true)) {
        contador++
    }

    print("Mora perto da vítima? ")
    val resposta3 = readLine()
    if(resposta3.equals("S",ignoreCase = true)) {
        contador++
    }

    print("Devia para a vítima? ")
    val resposta4 = readLine()
    if(resposta4.equals("S",ignoreCase = true)) {
        contador++
    }

    print("Já trabalhou com a vítima? ")
    val resposta5 = readLine()
    if(resposta5.equals("S",ignoreCase = true)) {
        contador++
    }

    when (contador) {
        2 -> print("Suspeito")
        3,4 -> print("Cumplice")
        5 -> print("Assassino")
        else -> print("Inocente")
    }


}