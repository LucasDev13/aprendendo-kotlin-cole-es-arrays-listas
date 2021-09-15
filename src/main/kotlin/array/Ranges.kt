fun main() {
    //mostra o range de 0 ate 10
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s,")
    }
    println()

    //vai até 100 pulando de 2 em e - ele é inclusivo
    val numerosPares = 2.until(100) step 2
    //in no for -> ele vai pegar cada elemento do array e jogar para a variável que estiver do lado esquerdo
    for(numeroPar in numerosPares){
        print("$numeroPar,")
    }
    println()
    //numeros pares reversos - 100 pulando de 2 em 2
    val numerosParesReversos = 100 downTo 0 step 2
    //it representa cada numero da série.
    numerosParesReversos.forEach { print("$it,") }

    println()
    //se um valor está dentro de um range
    val intervalo = 1500.0..5000.0
    val salario = 34000.0
    //in no if -> ele vai ter a função de verificar se o valor que está a esquerda está dentro do intervalo especificado
    //é um operador que stá sobrecarregado para fazer coisas diferentes dependendo do contesto que ele estiver
    if(salario in intervalo){
        println("Está no intervalo.")
    }else {
        println("Não está no intervalo.")
    }

    val charRange = 'a'..'z'
    val letra = 'k'
    println(letra in charRange)
}