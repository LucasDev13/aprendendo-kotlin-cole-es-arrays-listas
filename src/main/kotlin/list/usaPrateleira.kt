package list

fun main(){
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    prateleira.organizarPorAutor().imprimeComMarcadores()

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}