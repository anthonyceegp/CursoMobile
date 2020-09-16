package aula7.ex5

class Veiculo (val marca: String, val modelo: String, val ano:Int, val cor: String, val quilometragem: Int) {
    override fun toString(): String {
        return "$modelo ($marca) - $ano - $cor - $quilometragem Km"
    }
}