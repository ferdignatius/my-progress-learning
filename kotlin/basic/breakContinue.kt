package pengulangan4

fun main() {
//    break = menghentikan seluruh pengulangan

    var i = 0
    while(true){
        println(i)
        i++

        if (i > 10){
            break
        }
    }

    println("=========")

//    continue = menghentikan 1 pengulangan, dan melanjutkan pengulangan lain
    var x = 0
    for (x in 1..10){
        if (x % 2 == 0){
            continue
        }
        println(x)
    }

}