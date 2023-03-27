class accountBank (
    private  val customer: String,
    private var balance : Double,
    private val accountNumber: Int,
    private val agency : Int,
) {

    fun deposit (value : Double){
        println("Operação de depósito iniciada...")
        balance += value
        println("Depósito realizado com sucesso!")
        println("Saldo : $balance")
    }

    fun withdraw(value : Double){
        println("Operação de saque iniciada...")
        if(balance >= value){
            balance -= value
            println("Saque realizado com sucesso!")
            println("Saldo : $balance")
        }else{
            println("Saldo insuficiente para realizar o saque =( ")
        }
    }

    fun tranfer(value : Double,  destinationAccount: accountBank){
        println("Operação de transferir iniciada...")
        if(balance >= value){
            destinationAccount.deposit(value)
                println("Foi transferido $value para $destinationAccount")
        }else {
            println("Saldo insuficiente para realizar a transferencia =( ")
        }
    }

    fun extract (){
        println("Cliente: $customer")
        println("Agencia: $agency")
        println("Conta: $accountNumber")
        println("Saldo: $balance")
    }
}