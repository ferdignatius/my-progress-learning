package `41-50`

/**
 * Di Java ada error bernama NullPointerException karena mengakses properties / function null
 * Di Kotlin jarang, tapi ada cara agar tidak terjadi error null seperti di Java
 */

data class Friend (val nama: String)

fun sayHi(friend: Friend?){
//    cara 1 menggunakan null checking
    if (friend != null) {
        println("Cara 1 Hi ${friend.nama}")
    }

//    cara 2 pakai elvis operator
    val name = friend?.nama ?: ""
    println("Cara 2 Hi $name")
}

/**
 * Kita juga bisa menggunakan operator !!
 * Yang mengubah nullable menjadi bukan nullable
 * Tapi kalau ada data yang null, maka akan error
 */

fun sayHelloFriend(friend: Friend){
    val name = friend!!.nama
    println("Hello $name")
}


fun main() {
    sayHi(Friend("Ferdi"))
    sayHi(null)

    sayHelloFriend(Friend("Jomel"))
//    sayHelloFriend(null) // erro
}