package aula12.desafioEmAula

data class Estado(val nome: String, val sigla: String) {
    companion object {
        fun getEstados(): List<Estado> {
            return listOf(Estado("Acre","AC"),
                    Estado("Alagoas","AL"),
                    Estado("Amapá","AP"),
                    Estado("Amazonas","AM"),
                    Estado("Bahia","BA"),
                    Estado("Ceará","CE"),
                    Estado("Espírito Santo","ES"),
                    Estado("Goiás","GO"),
                    Estado("Maranhão","MA"),
                    Estado("Mato Grosso","MT"),
                    Estado("Mato Grosso do Sul","MS"),
                    Estado("Minas Gerais","MG"),
                    Estado("Pará","PA"),
                    Estado("Paraíba","PB"),
                    Estado("Paraná","PR"),
                    Estado("Pernambuco","PE"),
                    Estado("Piauí","PI"),
                    Estado("Rio de Janeiro","RJ"),
                    Estado("Rio Grande do Norte","RN"),
                    Estado("Rio Grande do Sul","RS"),
                    Estado("Rondônia","RO"),
                    Estado("Roraima","RR"),
                    Estado("Santa Catarina","SC"),
                    Estado("São Paulo","SP"),
                    Estado("Sergipe","SE"),
                    Estado("Tocantins","TO"),
                    Estado("Distrito Federal","DF"))
        }

    }
}
