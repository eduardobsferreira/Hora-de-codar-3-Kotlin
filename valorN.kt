//Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
//N  é um valor informado pelo usuário//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite um valor N (maior que 0): ")
    val n = readln()?.toIntOrNull() ?: 0

    if (n > 0) {
        println("Valores de 1 até $n:")
        for (i in 1..n){
            println(i)
    }
}else{
    println("Valor inválido! N deve ser maior que 0.")

}
}