fun main(args : Array<String>){
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val otherArray : Array<String> = arrayOf("Janna", "Nayna", "Jannayna")

    for (item in array){
        println(item)
    }
    otherArray.forEach { i -> println(i) }

    val map = mutableMapOf<Int, String>()
    map.put(1, "um")
    map[2] = "dois"
    map += 3 to "tres"

    for (item in map){
        println(item.key.toString() + "-> " + item.value)
    }

    val test : String = "teste imutavel"
    // test = "testando"
    var test2 : String = "teste mutavel"
    test2 = "testando"

    println(test)
    println(test2)

    var count : Int = 0

    while (count < 10){
        println(count++)
    }

    do{
        println(count)
    } while (count > 10)
}