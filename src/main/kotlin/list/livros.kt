package list

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sertão 1",
        autor = "Não",
        anoPublicacao = 1995
    ),
    Livro(
        titulo = "Grande Sertão 2",
        autor = "Não tem",
        anoPublicacao = 1996,
        editora = "Editora 2"
    ),
    Livro(
        titulo = "Grande Sertão 3",
        autor = "Não tem nada",
        anoPublicacao = 1997
    ),
    Livro(
        titulo = "Grande Sertão 4",
        autor = "Nada",
        anoPublicacao = 1998,
        editora = "Editora 4"
    )
)

val listaDeLivrosNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Grande Sertão 1",
        autor = "Não",
        anoPublicacao = 1995
    ),
    null,
    Livro(
        titulo = "Grande Sertão 2",
        autor = "Não tem",
        anoPublicacao = 1996,
        editora = "Editora 2"
    ),
    null,
    Livro(
        titulo = "Grande Sertão 3",
        autor = "Não tem nada",
        anoPublicacao = 1997
    ),
    null,
    Livro(
        titulo = "Grande Sertão 4",
        autor = "Nada",
        anoPublicacao = 1998,
        editora = "Editora 4"
    ),
    null
)