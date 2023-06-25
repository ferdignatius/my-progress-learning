package function5

fun sum(x: Int, y: Int): Int {
    val total = x + y
    return total
}

fun pembagian(x: Int, y: Int): Int {
    if (y == 0){
        return 0
    } else {
        val result = x / y
        return result
    }
}


fun main() {
    println(sum(1,2))

//    problem pembagian 0
    println(pembagian(10,2))
    println(pembagian(10,3))
    println(pembagian(10,0))


}