import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO}
//    salarios[0] = "1500.55".toBigDecimal()
//    salarios[1] = "2000.00".toBigDecimal()

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "1000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println(salariosComAumento.contentToString())
    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial> $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) {
        acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Gasto em 6 meses> $gastoTotal")

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal{
    //o reduce reduz o array inteiro a um valor só somando cada valor. Poderia fazer qualquer outra operação.
    return this.reduce {acumulador, valor ->
        acumulador + valor
    }
}