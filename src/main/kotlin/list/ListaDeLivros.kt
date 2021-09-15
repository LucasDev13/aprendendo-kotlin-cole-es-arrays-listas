package list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão 1",
        autor = "Não tem",
        anoPublicacao = 1995
    )

    val livro2 = Livro(
        titulo = "Grande Sertão 2",
        autor = "Não tem",
        anoPublicacao = 1996,
        editora = "Editora 2"
    )

    val livro3 = Livro(
        titulo = "Grande Sertão 3",
        autor = "Não tem",
        anoPublicacao = 1997
    )

    val livro4 = Livro(
        titulo = "Grande Sertão 4",
        autor = "Não tem",
        anoPublicacao = 1998,
        editora = "Editora 4"
    )
    //quando se trabalha com list é sempre com objetos
    //MutableList<Livro> -> o que fica dentro de <> é o tipo que indica que estamos usando Generics(cria um objeto do tipo genérico)
    //e todos os métodos da mutableList vai se adaptar ao tipo que é passado em <>
    //as listas tem valores dinâmicos e os array não, é definido já no momento de criação do array o seu tamanho
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Grande Sertão 5",
            autor = "Não tem",
            anoPublicacao = 1999
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    //sorted() traz a lista ordenada a partir de um critério
    //ordenado a partir da função implementado em Livro
    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    //ordenado a partir da função sortedBy
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de Livros ### \n$textoFormatado")
}