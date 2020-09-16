package aula7.ex5

class Concessionaria {
    var vendas = ArrayList<Venda>()

    fun registrarVenda (veiculo: Veiculo,cliente: Cliente, valor: Double) {
        vendas.add(Venda(valor,veiculo,cliente))
    }
}