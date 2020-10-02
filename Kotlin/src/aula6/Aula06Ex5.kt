package aula6

//Exercício 2 - Nível 2 - Aula 06

fun main() {
    print("Quanto você quer sacar: ")
    var valorSaque = readLine()!!.toInt()

    val notas = arrayOf(100,50,10,5,1)

    if (valorSaque < 10 || valorSaque > 600) {
        print("Valor de saque não permitido")
    } else {
        for (i in notas.indices) {
            val quantidadeNotas = valorSaque / notas[i]
            valorSaque -= quantidadeNotas * notas[i]
            if (quantidadeNotas != 0) {
                println("$quantidadeNotas notas de ${notas[i]}")
            }
        }
    }
}