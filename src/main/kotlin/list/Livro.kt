package list

data class Livro(
    //atributos definidos no construtor primário, e para cadata atributo,ele vai criar em tempo de compilação
    //os métodos toString, equals e hashCode tudo em tempo de compilação
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livro>{
    //data class é um tipo especial no kotlin, que ela fornece além das caracteristis normais de uma classe
    //ela já fornece algumas funções automáticamente
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}