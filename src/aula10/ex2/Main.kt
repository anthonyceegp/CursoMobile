package aula10.ex2

import kotlin.random.Random

fun main() {
    val fatura = Fatura()

    for (i in 1..10) {
        fatura.itens.add(Item(i,"Item de número $i",
                Random.nextInt(-10, 10).toDouble(),
                Random.nextInt(-10, 10)))
    }

    print(fatura.getTotalFatura())
}