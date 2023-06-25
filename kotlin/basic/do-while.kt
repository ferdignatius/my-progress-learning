package pengulangan4

fun main() {
    var x = 0
    do {
        println(x)
        x++
    } while (x < 6)

    println("========")
//    perbedaan dengan while
    var i = 4


//    while
    while (i <5){
        println(i)
        i++
    }

    println("========")
//   do while

    do {
        println(i)
        i++
    } while (i <5)
}