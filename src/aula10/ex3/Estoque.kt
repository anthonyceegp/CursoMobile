package aula10.ex3

class Estoque(var nome: String, private var qtdMinima: Int) {

    private var qtdAtual = 0

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        if(qtdMinima >= 0) {
            this.qtdMinima = qtdMinima
        } else {
            println("A quantidade mínima não pode ser negativa")
        }
    }

    fun repor(qtd: Int) {
        if (qtd > 0) {
            qtdAtual += qtd
        } else {
            println("A quantidade deve ser maior que zero")
        }
    }

    fun darBaixa(qtd: Int) {
        if(qtdAtual - qtd > 0) {
            qtdAtual -= qtd
        } else {
            println("Quantidade informado superior ao presente no estoque")
        }
    }

    fun mostrar(): String {
        return "Nome do produto: $nome\n" +
                "Quantidade mínima: $qtdMinima\n" +
                "Quantidade atual: $qtdAtual"
    }

    fun precisaRepor() = qtdAtual <= qtdMinima
}