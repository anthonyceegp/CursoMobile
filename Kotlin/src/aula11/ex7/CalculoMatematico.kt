package aula11.ex7

class CalculoMatematico {
    @Throws(ArithmeticException::class)
    fun divisao(dividendo: Int, divisor: Int): Int {
        if (divisor == 0) throw ArithmeticException("Divisão por zero")
        return dividendo / divisor
    }
}