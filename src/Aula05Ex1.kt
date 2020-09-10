fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        print("O número informado é par")
    } else {
        print("O número informado é ímpar")
    }
}