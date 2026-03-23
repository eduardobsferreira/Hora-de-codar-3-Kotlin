
    fun main() {
        println("Digite o valor N:")
        val n = readLine()?.toIntOrNull() ?: 0

        if (n > 0) {
            for (i in 1..n) {
                println("Tabuada do $i:")
                for (j in 1..10) {
                    println("$i x $j = ${i * j}")
                }
                println() //
            }
        } else {
            println("Valor inválido! N deve ser maior que 0.")
        }
    }
