package aula8

abstract class ContaBancaria (val numero:Int) {
    var saldo = 0.0

    abstract fun sacar(valor: Double): Boolean
    abstract fun depositar(valor: Double) :Boolean
    abstract fun mostrarDados()

    fun transferir(valor: Double, contaDestino: ContaBancaria): Boolean {
        var retorno = true
        val saldoContaOrigem = saldo
        val saldoContaDestino = contaDestino.saldo
        if (!sacar(valor) || !contaDestino.depositar(valor)) {
            saldo = saldoContaOrigem
            contaDestino.saldo = saldoContaDestino
            println("Operação cancelada")
            retorno = false
        }

        return retorno
    }
}