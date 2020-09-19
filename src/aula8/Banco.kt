package aula8

class Banco : IImprimivel {
    var numeroConta = 0
    var contas = ArrayList<ContaBancaria>()

    fun inserir(conta: ContaBancaria) = contas.add(conta)

    fun remover(conta: ContaBancaria) = contas.remove(conta)

    fun procurarConta(numero: Int): ContaBancaria? {
        for (i in contas.indices) {
            if (contas[i].numero == numero) return contas[i]
        }
        return null
    }

    fun obterNumeroConta():Int {
        numeroConta++
        return numeroConta
    }

    override fun imprimirDados() {
        contas.forEach {
            it.mostrarDados()
            println()
        }
    }


}