//Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   println("Digite um número (menor):")
   val inicio =  readln().toInt()

    println("Digite um número(maior): ")
    val fim = readln().toInt()
  var soma = 0
    var quantidade = 0

    for (i in inicio..fim){
        soma += i
            quantidade ++
    }
    val media = soma.toDouble() / quantidade
    println("A média aritmética dos números de $inicio a $fim é: $media")
}