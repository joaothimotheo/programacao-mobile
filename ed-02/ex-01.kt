fun main(args: Array<String>) {
    println("Informe um número inteiro");
    val number = readLine()!!.toInt();
    var aux =1;

    for (i in 2..number){
        aux *= i;
    }


    println("O fatorial do número $number é: $aux ");



}