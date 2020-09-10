package Aula4

fun main() {
    print("Quanto você ganha por hora: ")
    val ganhoPorHora = readLine()!!.toDouble()

    print("Qual o número de horas trabalhadas no mês: ")
    val horasTrabalhadas = readLine()!!.toDouble()

    val salarioBruto = ganhoPorHora * horasTrabalhadas
    val ir = salarioBruto * 0.11
    val inss = salarioBruto * 0.08
    val sindicato = salarioBruto * 0.05
    val salarioLiquido = salarioBruto - ir - inss - sindicato

    println("")
    println("+ Salário bruto : R$ ${"%.2f".format(salarioBruto)}")
    println("- IR (11%) : R$ ${"%.2f".format(ir)}")
    println("- INSS (8%) : R$ ${"%.2f".format(inss)}")
    println("- Sindicato (5%) : R$ ${"%.2f".format(sindicato)}")
    println("= Salário líquido : R$ ${"%.2f".format(salarioLiquido)}")
}