package aula8

class ContaCorrente(numero: Int, val taxaOperacao: Double) : ContaBancaria(numero), IImprimivel {
    override fun sacar(valor: Double): Boolean {
        var retorno = false
        if (saldo >= valor + taxaOperacao) {
            saldo -= valor + taxaOperacao
            retorno = true
        } else {
            println("Saldo insuficiente")
        }

        return retorno
    }

    override fun depositar(valor: Double): Boolean {
        var retorno = false
        if (valor >= saldo + taxaOperacao) {
            saldo += valor
            retorno = true
        } else {
            println("Valor de depósito insuficiente")
        }

        return retorno
    }

    override fun mostrarDados() {
        println("Número: $numero")
        println("Saldo: $saldo")
        println("Taxa de operação: $taxaOperacao")
    }

    override fun imprimirDados() {
        mostrarDados()
    }
}