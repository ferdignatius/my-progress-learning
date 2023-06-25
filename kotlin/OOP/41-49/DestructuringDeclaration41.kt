package `41-50`

/**
 * Adalah membuat multiple variable dari sebuah objek
 * Harusnya kita harus membuat function componentX untuk destructuring, namun itu sudah otomatis di kotlin
 */


data class DestructuringDeclaration41(val nama: String, val jenis: String) {
//    manual
//    operator fun component1(): String = nama
//    operator fun component2(): String = jenis
}

/**
 * Destructuring juga bisa dilakukan di function
 * Dengan ini kita dapat mengembalikan multiple return value pada function
 */

data class MinMax(val min: Int, val max: Int)
fun minmax(value1: Int, value2: Int): MinMax{
    return when{
        value1 > value2 -> MinMax(value2,value1)
        else -> MinMax(value1,value2)
    }
}

/**
 * Destructuring juga bisa dilakukan di lambda
 */
data class Login(val username: String, val password: String)
fun login(login: Login, callback:(Login) -> Boolean): Boolean{
    return callback(login)
}

fun main() {
    val minecraft = DestructuringDeclaration41("Minecraft", "Game")
    val (nama, jenis) = minecraft // destructuring deklarasi
    println(nama)
    println(jenis)

//  kalau gak mau salah satu, ganti dengan _
    val (min,_) = minmax(300,200) // destructuring deklarasi
    println(min)

    val login = Login("Jomel", "rahasia")
    login(login){(username, password) ->
        username == "Ferdi" && password == "rahasia"
    }
}