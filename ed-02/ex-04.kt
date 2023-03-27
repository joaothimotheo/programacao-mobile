fun main() {
    println("Digite as três notas do aluno:")
    val assessment = readLine()!!.toDouble()
    val assessment2 = readLine()!!.toDouble()
    val assessment3 = readLine()!!.toDouble()

    val average = (assessment * 2 + assessment2 * 3 + assessment3 * 5) / 10

    if (average >= 7) {
        println("Nota $average - Aprovado")
    } else if (average < 5) {
        println("Nota $average - Abaixo da média")
    } else {
        println("Nota - $average - Exame final")
    }
}
