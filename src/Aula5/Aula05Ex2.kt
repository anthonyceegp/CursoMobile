package Aula5
fun main() {
    print("Quanto você quer sacar: ")
    var valorSaque = readLine()!!.toInt()

    val quantidadeNotaCem: Int
    val quatidadeNotaCinquenta: Int
    val quantidadeNotaDez: Int
    val quantidadeNotaCinco: Int
    val quantidadeNotaUm: Int
    if (valorSaque < 10 || valorSaque > 600) {
        print("Valor de saque não permitido")
    } else {
        if (valorSaque >= 100) {
            quantidadeNotaCem = valorSaque / 100
            valorSaque -= (quantidadeNotaCem * 100)
            println("$quantidadeNotaCem notas de 100")
        }

        if (valorSaque >= 50) {
            quatidadeNotaCinquenta = valorSaque / 50
            valorSaque -= (quatidadeNotaCinquenta * 50)
            println("$quatidadeNotaCinquenta notas de 50")
        }

        if (valorSaque >= 10) {
            quantidadeNotaDez = valorSaque / 10
            valorSaque -= (quantidadeNotaDez * 10)
            println("$quantidadeNotaDez notas de 10")
        }

        if (valorSaque >= 5) {
            quantidadeNotaCinco = valorSaque / 5
            valorSaque -= (quantidadeNotaCinco * 5)
            println("$quantidadeNotaCinco notas de 5")
        }

        quantidadeNotaUm = valorSaque
        if (quantidadeNotaUm > 0) {
            println("$quantidadeNotaUm notas de 1")
        }
    }
}