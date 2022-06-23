fun main(args : Array<String>){
    val number1 : Int = 20
    val number2 : Int = 30

    if(number1 > number2){
        println("Number1 é maior!")
    } else if (number1 < number2) {
        println("Number2 é maior!")
    } else if (number1 == number2){
        println("Os numeros sao iguais!")
    }

    val max = if (number1 > number2) number1 else number2
    println("Maior numero: $max")

    val maxWho : String = if(number1 > number2){
        "Number1"
    } else {
        "Number2"
    }

    println("Maior numero: $maxWho")

    when(max){
        20 -> println("vinte")
        30 -> println("trinta")
        else -> println("nenhum")
    }
}