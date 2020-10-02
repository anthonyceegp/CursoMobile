package aula7.ex5

fun main() {
    val concessionaria = Concessionaria()

    val veiculo1 = Veiculo("Chevrolet","Onix", 2020, "Branco", 10000)
    val cliente1 = Cliente("Anthony","Silva","81 9 9999-9999")
    concessionaria.registrarVenda(veiculo1, cliente1, 25000.0)

    val veiculo2 = Veiculo("Hyundai","HB20", 2019, "Sand", 10000)
    val cliente2 = Cliente("Josianne","Viana","81 9 9999-9998")
    concessionaria.registrarVenda(veiculo2, cliente2, 23000.0)

    concessionaria.vendas.forEach { venda ->
        println(venda)
        println()
    }
}