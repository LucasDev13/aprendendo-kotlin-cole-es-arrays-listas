import java.math.BigDecimal

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    //o reduce reduz o array inteiro a um valor só somando cada valor. Poderia fazer qualquer outra operação.
    return this.reduce {acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }
}