package aula8

class ContaPoupanca (numero: Int, val limite: Double) : ContaBancaria(numero), IImprimivel {
    override fun sacar(valor: Double): Boolean {
        var retorno = false
        if(valor <= saldo + limite) {
            saldo -= valor
            retorno = true
        } else {
            println("Saldo insuficiente")
        }

        return retorno
    }

    override fun depositar(valor: Double): Boolean {
        var retorno = false
        if (valor > 0) {
            saldo += valor
            retorno = true
        } else {
            println("Valor de depósito deve ser maior que zero")
        }

        return retorno
    }

    override fun mostrarDados() {
        println("Número: $numero")
        println("Saldo: $saldo")
        println("Limite: $limite")
    }

    override fun imprimirDados() {
        mostrarDados()
    }
}