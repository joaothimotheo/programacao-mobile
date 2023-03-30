interface Check 
{
    fun printCheck(valor:Float){}
}   

open class AccountBank (
    val customer:String,
    var balance:Float, 
    val accountNumber:Int, 
    val agency:Int):
    
    Comparable<AccountBank >,Check
{
   
    override fun compareTo(other: AccountBank ): Int = this.customer.compareTo(other.customer) 
   
    override fun toString(): String = "$customer $balance"

    var valorT: Float = 0f
    
    fun Deposit(valueDeposit:Float)
    {
        balance = balance + valueDeposit
    }
    
    fun Withdraw(withdrawValue:Float)
    {
       balance =  balance - withdrawValue        
    }
    
    fun Transfer(valueTransfer:Float)
    {       
        balance = balance - valueTransfer
        valorT  = valueTransfer       
    }
    
    fun printExtract() {
        println("customer: $customer,\nbalance: R$ $balance \n")
    }
    
      override fun printCheck(valor:Float){
        println("Check: R$ $valor")
    }
    
    
}


fun main() 
{
  val c = AccountBank ("Thimotheo",333,666,01901)
  c.printCheck(7543f)
   
}