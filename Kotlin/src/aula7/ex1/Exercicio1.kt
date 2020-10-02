package aula7.ex1

fun main () {
    val cliente1 = Cliente("Anthony","Silva")
    val cliente2 = Cliente("Josianne","Silva")

    val contaCliente1 = Conta("00001", cliente1, 0.0)
    val contaCliente2 = Conta("00002", cliente2, 0.0)

    contaCliente1.depositar(100.0)
    contaCliente1.sacar(200.0)

    contaCliente2.depositar(1000.0)
    contaCliente2.sacar(500.0)
}