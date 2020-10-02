package aula7.ex2

class JogadorDeFutebol(val nome: String, var energia: Int) {
    private var alegria: Int = 0
    private var gols: Int = 0
    var experiencia: Int = 0

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols++

        println("GOOOOL!")
        println()
    }

    fun correr() {
        energia -= 10

        println("Cansei")
        println()
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Energia: $energia\n" +
                "Alegria: $alegria\n" +
                "Gols: $gols\n" +
                "Experiência: $experiencia"
    }
}