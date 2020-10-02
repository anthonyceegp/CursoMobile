package aula12.ex1

fun main() {
    val loteriaDosSonhos = mapOf<Int, String>(0 to "Ovos",
            1 to "Água",
            2 to "Escopeta",
            3 to "Cavalo",
            4 to "Dentista",
            5 to "Fogo"
    )

    loteriaDosSonhos.forEach {
        println("${it.key}: ${it.value}")
    }

    val apelidoAmigos = mapOf<String, List<String>>(
            "João" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George")
    )
    println()
    apelidoAmigos.forEach {
        println("${it.key}: ${it.value}")
    }
}