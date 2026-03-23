//Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário. //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val notas = mutableListOf<Double>()

    for (i in 1..6){
        var nota: Double?
        do {
            println("digite a nota $i (0 a 10):")
            nota = readln()?.toDoubleOrNull()

            if (nota == null || nota < 0.0 || nota > 10.00) {
                println("Digite uma nota válida ")
                nota = null
            }
        }  while (nota == null)
        notas.add (nota)

        }
val media = notas.sum() / notas.size
println ("Média final: $media")
}