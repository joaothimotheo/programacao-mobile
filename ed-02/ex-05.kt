fun main() {
    println("Informe um valor em dinheiro: ")
    val value = readLine()!!.toDouble()

    var valueCents = (value * 100).toInt()

    val coins = intArrayOf(100, 50, 25, 10, 5, 1)
    var qtdCoins = 0

    for (coin in coins) {
        qtdCoins += valueCents / coin
        valueCents %= coin
    }

    println("O valor monetário de R$ $value pode ser representado com o mínimo de $qtdCoins moedas.")
}
