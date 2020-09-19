package aula10.ex2

class Item (val numero:Int, val descricao: String, var preco: Double, var quantidade: Int) {
    init {
        this.preco = if (preco >= 0.0) preco else 0.0
        this.quantidade = if (quantidade >= 0) quantidade else 0
    }
}