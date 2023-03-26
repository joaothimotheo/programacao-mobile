fun main(args: Array<String>) {

    for (i in 0..10){
        var fat =1;
        for (j in 2..i){
            fat *= j;
        }
        println("$i : $fat");
    }
}