package aula6

// Exercício 3 - Função - Aula 6 - Nível 1

fun main() {
    print(somaImposto(2.0,10.0))
}

fun somaImposto(taxaImposto:Double, custo:Double) = (1 + taxaImposto/100) * custo