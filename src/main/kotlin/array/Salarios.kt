fun main(){
    val salarios: DoubleArray = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    //incrementando os indices manualmente
//    var indice = 0
//    for(salario in salarios){
//        salarios[indice] = salario * aumento
//    }
//
//    println(salarios.contentToString())

    //incrementando os indices utilizando a função indices do kotlin
    for (indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())

    val aumento2 = 2.2
    salarios.forEachIndexed{ i, salario ->
        salarios[i] = salario * aumento2
    }

    println(salarios.contentToString())
}