package function6

import function5.hallo
import function5.helloNama

// anonymous function adalah lambda yang lebih fleksibel seperti function

fun main() {

//    anonymous function
     val anonymousUpper = fun(value: String): String {
         if (value.isNullOrBlank()){
             return "Null"
         } else {
             return value.toUpperCase()
         }
     }

//    memanggil anonymous function
    val result = hello("ferdi", anonymousUpper)
    println(result)

    println(hello("JOMEL", fun(value: String): String {
            return value.toLowerCase()
    }))

}