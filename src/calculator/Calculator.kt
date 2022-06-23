fun main(args : Array<String>){
    runMenu()
}

fun runMenu(){
    do{
        println("Choose an option: ")
        println("1 -> sum\n" +
                "2 -> sub\n" +
                "3 -> mult\n" +
                "4 -> div\n" +
                "5 -> exit")

        val option : Char = readLine()!!.toCharArray()[0]

        if (option == '5') break

        println("Write the first number: ")
        val num1 : Double = readLine()!!.toDouble()

        println("Write the second number: ")
        val num2 : Double = readLine()!!.toDouble()

        when(option){
            '1' -> sum(num1, num2)
            '2' -> sub(num1, num2)
            '3' -> mult(num1, num2)
            '4' -> div(num1, num2)
        }
    } while (option != '5')

}

fun sum(num1 : Double, num2 : Double){
    println("$num1 + $num2 = ${num1.plus(num2)}")
}

fun sub(num1 : Double, num2 : Double){
    println("$num1 - $num2 = ${num1.minus(num2)}")
}

fun mult(num1 : Double, num2 : Double){
    println("$num1 * $num2 = ${num1.times(num2)}")
}

fun div(num1 : Double, num2 : Double){
    println("$num1 / $num2 = ${num1.div(num2)}")
}