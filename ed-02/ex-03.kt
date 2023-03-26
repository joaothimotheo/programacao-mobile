fun main(args: Array<String>) {
    println("Informe o primeiro número real: ");
    val firstNumber =  readln()!!.toDouble()
    println("Informe o segundo número: ")
    val seccondNumber = readln()!!.toDouble()
    println("Informe o terceiro número: ")
    val thirdNumber = readln()!!.toDouble()

    val numbers = listOf(firstNumber, seccondNumber, thirdNumber)
    val result = numbers.sorted()

    println("Os números informados em ordem cresente são: $result")

}