package aula6

// Exercício 4 - Função - Aula 6 - Nível 1

import kotlin.random.Random

fun main() {
    var valorMeta = -1
    var fimJogo = false

    var valor = rolarDados()
    when (valor) {
        7, 11 -> {
            println("Natural! Você ganhou :D")
            fimJogo = true
        }
        2, 3, 12 -> {
            println("Craps! Você perdeu :(")
            fimJogo = true
        }
        else -> {
            valorMeta = valor
            println("Sua meta é tirar o valor $valorMeta")
        }
    }

    do {
        if (fimJogo) {
            break
        }

        println()

        valor = rolarDados()

        if (valor == 7) {
            println("Você perdeu :(")
            fimJogo = true
        } else if (valor == valorMeta) {
            println("Você ganhou \\o/")
            fimJogo = true
        }
    } while (true)
}


fun rolarDados(): Int {
    print("Tecle Enter para rolar os dados")
    readLine()
    val valor = Random.nextInt(2, 12)
    println("Soma dos dados: $valor")
    return valor
}