package `1-10`

/**
 * Kotlin memiliki kemampuan untuk memasukkan properties langsung di dalam constructor
 * Yaitu dengan menambahkan val/var di parameternya
 * Maka langsung otomatis jadi properties
 */
class PropertiesConstructor (
//    properties constructor
    var name: String,
    var kelas: String,
    val gender: String
        ){}

fun main() {
    val user1 = PropertiesConstructor("ferdi", "xi", "Pria")
    val user2 = PropertiesConstructor("esi", "xi", "Wanita")

    println(user1.name)
    println(user2.name)
}