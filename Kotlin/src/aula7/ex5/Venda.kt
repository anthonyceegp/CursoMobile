package aula7.ex5

class Venda (val valorDaVenda: Double, val veiculo: Veiculo, val cliente: Cliente) {
    override fun toString(): String {
        return "Valor da venda: ${"%.2f".format(valorDaVenda)} R$\n" +
                "Veículo: $veiculo\n" +
                "Clinete: $cliente"
    }
}