package list

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
//        .filter { it != null }
        //filterNotNull -> Retorna todos os elementos da lista que não são nulos.
        .filterNotNull()
        .joinToString(separator = "\n") {
            //estou utilizando nullSafe - safe call
//        " - ${it?.titulo} de ${it?.autor}"
            " - ${it.titulo} de ${it.autor}"
    }

    println(" ### Lista de Livros ### \n$textoFormatado")
}