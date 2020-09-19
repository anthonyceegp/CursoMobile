package aula8

const val MENU_PRINCIPAL = 1
const val MENU_SECUNDARIO = 2
const val SELECIONAR_CONTA = 3
const val FINALIZAR = 4
const val CRIAR_CONTAR = 5
const val REMOVER_CONTA = 6
const val GERAR_RELATORIO = 7

fun main() {
    /*var contaPoupanca = ContaPoupanca(1,500.0)
    var contaCorrente = ContaCorrente(2, 7.0)

    contaPoupanca.depositar(1000.0)
    contaCorrente.depositar(500.0)

    contaPoupanca.sacar(1600.0)
    contaCorrente.sacar(200.0)

    val relatorio = Relatorio()
    relatorio.gerarRelatorio(contaPoupanca)
    println()
    relatorio.gerarRelatorio(contaCorrente)*/


    val banco = Banco()
    var conta:ContaBancaria? = null
    var estado = MENU_PRINCIPAL

    do {
        when (estado) {
            MENU_PRINCIPAL -> {
                when (lerOpcaoPrimaria()) {
                    1 -> estado = CRIAR_CONTAR
                    2 -> estado = SELECIONAR_CONTA
                    3 -> estado = REMOVER_CONTA
                    4 -> estado = GERAR_RELATORIO
                    5 -> estado = FINALIZAR
                    else -> print("Opção inválida")
                }
            }
            SELECIONAR_CONTA -> {
                conta = banco.procurarConta(lerNumeroConta())
                estado = if(conta != null) {
                    MENU_SECUNDARIO
                } else {
                    print("Conta inexistente")
                    MENU_PRINCIPAL
                }
            }
            MENU_SECUNDARIO -> {
                when (lerOpcaoSecudaria()) {
                    "a" -> {
                        print("Digite o valor a ser depositado: ")
                        val valor = readLine()!!.toDouble()
                        if(conta != null && conta.depositar(valor)) {
                            print("Operação realizada com sucesso")
                        }
                    }
                    "b" -> {
                        print("Digite o valor a ser sacado: ")
                        val valor = readLine()!!.toDouble()
                        if(conta != null && conta.sacar(valor)) {
                            print("Operação realizada com sucesso")
                        }
                    }
                    "c" -> {
                        print("Digite o valor a ser transferido: ")
                        val valor = readLine()!!.toDouble()
                        print("Digite o número da conta de destino: ")
                        val numeroContaDestino = readLine()!!.toInt()
                        val contaDestino = banco.procurarConta(numeroContaDestino)
                        if(contaDestino != null) {
                            if(conta != null &&  conta.transferir(valor, contaDestino)) {
                                print("Operação realizada com sucesso")
                            }
                        } else {
                            println("Conta inexistente")
                        }
                    }
                    "d" -> conta?.mostrarDados()
                    "e" -> estado = MENU_PRINCIPAL
                    else -> print("Opção inválida")
                }
            }
            CRIAR_CONTAR -> {
                when (escolherTipoConta()) {
                    "p" -> {
                        print("Digite o limite da conta: ")
                        val limite = readLine()!!.toDouble()
                        banco.inserir(ContaPoupanca(banco.obterNumeroConta(),limite))
                        print("Conta cadastrada com sucesso!")
                        estado = MENU_PRINCIPAL
                    }
                    "c" -> {
                        print("Digite o valor da taxa de operação: ")
                        val taxa = readLine()!!.toDouble()
                        banco.inserir(ContaCorrente(banco.obterNumeroConta(),taxa))
                        print("Conta cadastrada com sucesso!")
                        estado = MENU_PRINCIPAL
                    }
                    "x" -> {
                        print("Operação cancelada")
                        estado = MENU_PRINCIPAL
                    }
                    else -> print("Opção inválida")
                }
            }
            REMOVER_CONTA -> {
                conta = banco.procurarConta(lerNumeroConta())
                if(conta != null) {
                    banco.remover(conta)
                    conta = null
                } else {
                    print("Conta inexistente")
                }
                estado = MENU_PRINCIPAL
            }
            GERAR_RELATORIO -> {
                banco.imprimirDados()
                estado = MENU_PRINCIPAL
            }
        }
        print("\n\n")
    } while (estado != FINALIZAR)
}

fun lerOpcaoPrimaria():Int {
    println("1 -> Criar conta")
    println("2 -> Selecionar conta")
    println("3 -> Remover conta")
    println("4 -> Gerar relatório")
    println("5 -> Finalizar")
    print("Digite o número da operação desejada: ")
    return readLine()!!.toInt()
}

fun lerOpcaoSecudaria():String {
    println("a -> Depositar")
    println("b -> Sacar")
    println("c -> Transferir")
    println("d -> Gerar relatório")
    println("e -> Retornar ao menu anteriror")
    print("Digite a letra da operação desejada: ")
    return readLine()!!.toString()
}

fun lerNumeroConta():Int {
    print("Digite o número da conta: ")
    return readLine()!!.toInt()
}

fun escolherTipoConta():String {
    println("p -> Conta poupança")
    println("c -> Conta corrente")
    println("x -> Cancelar")
    print("Digite o tipo de conta desejado: ")
    return readLine()!!.toString()
}