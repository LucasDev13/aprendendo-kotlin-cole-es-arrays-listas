fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 44, 67)
    val maiorIdade = idades.maxOrNull()
    println("maior idade> $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("menor idade> $menorIdade")

    val media: Double = idades.average()
    println("media idade> $media")

    //all retornar true para todos os valores que atenderem a condição
    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores? $todosMaiores")

    //any vai retornar quando pelo menos 1 atender a condição
    val existeMaior = idades.any { it >= 18 }
    println("Alguem maior de idade? $existeMaior")

    //filter vai filtrar os valores e atendem a condição e retornar em uma lista
    val maiores = idades.filter { it >= 18 }
    println("Maiores lista> $maiores")

    //find busca na lista e retornar o primeiro valor que atenda a condição. Se tiver dois valores iguais ele retorna
    //o primeiro.
    val igual = idades.find { it >= 18 }
    println("Igual a> $igual")
}