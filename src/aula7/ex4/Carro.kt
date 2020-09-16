package aula7.ex4

class Carro (private val consumo: Int) {
    private var combustivel = 0.0

    fun andar(distancia: Double) {
        val distanciaMaxPossivel = consumo * combustivel
        val distanciaPercorrida = if (distancia <= distanciaMaxPossivel) distancia else distanciaMaxPossivel
        val distanciaFaltante = distancia - distanciaPercorrida
        combustivel -= distanciaPercorrida / consumo
        println("Distância percorrida: $distanciaPercorrida Km")
        println("Distância faltante: $distanciaFaltante Km")
        if(distanciaPercorrida < distancia) {
            println("Sem combustível para prosseguir")
        } else {
            println("Chegamos ao dstino")
        }
    }

    fun obterGasolina():Double {
        print("Quantidade de combustível no tanque: $combustivel L")
        return combustivel
    }

    fun adicionarGasolina(quantidade: Double) = combustivel + quantidade
}
