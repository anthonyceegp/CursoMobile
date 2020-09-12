package aula6

// Exercício 2 - Função - Aula 6 - Nível 1

fun main () {
    println(ehPositivo(3))
    println(ehPositivo(0))
    println(ehPositivo(-1))
}

fun ehPositivo (numero:Int) = if (numero > 0) 'P' else 'N'