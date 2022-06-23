fun main(args : Array<String>){
    print("Digite seu nome: ")
    val name = readLine()!!

    print("Digite sua idade: ")
    val age : Int = readLine()!!.toInt()

    println("My name is $name and I have $age years old. My name has ${name.length} characters!")
}