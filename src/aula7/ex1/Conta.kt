package aula7.ex1

class Conta (val numeroConta: String, val titular: Cliente, var saldo: Double) {

    fun depositar (valor: Double) {
        saldo += valor
        println("Cliente: ${titular.nome} ${titular.sobreNome}")
        println("Transação: Depósito")
        println("Novo saldo: $saldo")
        println()
    }

    fun sacar (valor: Double) {
        if (saldo < valor) {
            println("Cliente: ${titular.nome} ${titular.sobreNome}")
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Cliente: ${titular.nome} ${titular.sobreNome}")
            println("Transação: Saque")
            println("Novo saldo: $saldo")
        }
        println()
    }
}