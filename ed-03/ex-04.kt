import java.time.LocalDate

class SalvingAccount(accountNumber: String, customer: String, balance: Double, openDate: LocalDate) 
: Account(accountNumber, customer, balance, openDate) 
{
    fun applyInterest()
    {
        val interest = balance * 0.003 
        depositar(interest)
    }
}