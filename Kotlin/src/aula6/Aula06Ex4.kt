package aula6
//Exercício 1 - Nível 2 - Aula 06

fun main() {
    val votos = arrayOf(0, 0, 0, 0, 0, 0)
    val sistemasOperacionais = arrayOf("Window Server", "Unix         ", "Linux        ",
            "Netware      ", "Mac OS       ", "Outro        ")
    var totalVotos = 0
    var numeroVotoMaisVotado = -1
    var indiceMaisVotado = -1

    println("Qual o melhor Sistema Operacional para uso em servidores?")
    println("As possíveis respostas são:")
    println()
    println("1 - Window Server")
    println("2 - Unix")
    println("3 - Linux")
    println("4 - Netware")
    println("5 - Mac OS")
    println("6 - Outro")
    println("0 - Exit")
    println()

    do {
        print("Digite seu voto: ")
        val vote = readLine()!!.toInt()
        if (vote == 0) {
            break
        } else if (vote > 6 || vote < 0) {
            println("Valor inválido! ")
            continue
        }
        totalVotos++
        votos[vote - 1]++
    } while (true)

    println()
    println("Sistema Operacional\tVotos\t%")
    println("-------------------\t-----\t---")
    for (i in sistemasOperacionais.indices) {
        var percentual = (votos[i] * 100.0) / totalVotos
        if (percentual.equals(Double.NaN)) percentual = 0.0
        println("${sistemasOperacionais[i]}\t\t${votos[i]}\t\t${"%.2f".format(percentual)}")

        if (votos[i] > numeroVotoMaisVotado) {
            numeroVotoMaisVotado = votos[i]
            indiceMaisVotado = i
        }
    }

    println()
    if (totalVotos > 0) {
        var percentual = (numeroVotoMaisVotado * 100.0) / totalVotos
        if (percentual.equals(Double.NaN)) percentual = 0.0
        println("O Sistema Operacional mais votado foi o ${sistemasOperacionais[indiceMaisVotado]}, " +
                "com $numeroVotoMaisVotado votos, " +
                "correspondendo a ${"%.2f".format(percentual)}% dos votos.")
    } else {
        println("Ninguém participou da pesquisa! :(")
    }
}