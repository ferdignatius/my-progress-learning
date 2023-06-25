package function5

// sebenernya ini sih cuma utk mempermudah dan mempersingkat penggunaan return dalam if & when

fun main() {

//    return if
    fun satu(x: String = ""): String {
        return if (x == ""){
            "Belom ke input tuh"
        } else {
            "Hallo $x"
        }
    }


    println(satu("ferdi"))
    println(satu())


//    return when
    fun dua(x: String = ""): String {
        return when (x){
            "" -> "HAH?"
            else -> "Hai $x"

        }
    }

    println(dua("esii"))
    println(dua())

}