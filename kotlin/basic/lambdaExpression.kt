package function6

// lambda expression -> function tanpa nama, biasanya untuk membuat function yang tidak terlalu kompleks

fun toUpper(value: String): String = value.toUpperCase()

fun main() {
//    membuat lambda
    val contohLambda: (String) -> String = { firstname: String ->
        firstname
    }
    val contohLambda2 = { lastname: String -> lastname }

//    memanggil lambda
    val print = contohLambda("ferdi")
    println(print)
    println(contohLambda("esii"))


//    it -> kalau cuma 1 parameter, bisa pakai it
    val toUpperLambda: (String) -> String = {
        it.toUpperCase()
    }

//    method refrences ->  lambda yang memanggil function lain
    val gedein: (String) -> String = ::toUpper
    println(gedein("ferdi"))
}