fun main() {
    val account1 = accountBank("Fernando", 1000.0, 1234, 123)
    val account2 = accountBank("Peçanha", 666.0, 9383, 1973)

    account1.deposit(20.0)
    account2.withdraw(70.0)
    account1.tranfer(10.0, account2)

    account1.extract()
    account2.extract()
}