package aula10.ex2

class Fatura {
    val itens = ArrayList<Item>()

    fun getTotalFatura(): Double {
        var total = 0.0
        itens.forEach { item ->
            total += item.quantidade * item.preco
        }
        return total
    }
}