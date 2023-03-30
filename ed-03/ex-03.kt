fun main() 
{
    val contas = listOf(
        accountBank("Peçanha", 290.0, 1234, "001"),
        accountBank("Ana Paula", 9.0, 5678, "002"),
        accountBank("Felipe", 83113.0, 2345, "001"),
        accountBank("Thimotheo", 313.0, 7890, "003"),
        accountBank("José", 00.0, 3456, "002")
    )

    println("Contas em saldo crescente:")
    contas.sortedBy { it.saldo }.forEach { it.imprimirExtrato() }

    println("Contas em ordem alfabética:")
    contas.sortedBy { it.cliente }.forEach { it.imprimirExtrato() }
}