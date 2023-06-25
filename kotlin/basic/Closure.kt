package function6

// closure => kemampuan function, lambda, anonymous function berinteraksi dengan data disekitar dalam scope yang sama
// kalau bisa hindari closure, karena bisa merubah data
// ini sering digunakan dalam while, tapi versi functionnya

fun main() {
    var count: Int = 0
//    lambda
    val lambdaIncrementAction = {
        println("+1 dari lambdaIncrementAction")
        count++
    }

//    anonymous function
    val anonymousIncrementAction = fun () {
        println("+1 dari anonymousIncrementAction")
        count++
    }

//    function
    fun funtionIncrementAction() {
    println("+1 dari functionIncrementAction")
    count++
    }

    println(count) // data var count sama
    lambdaIncrementAction()
    anonymousIncrementAction()
    funtionIncrementAction()
    println(count) // data var count berubah


//     bahaya lain closure
    var name = "ferdi"
    fun scopename(){
        name = "jomel"
    }
    println(name)
    scopename()
    println(name)
}
