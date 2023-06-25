package `11-20`

/**
 * Semua class yang tidak punya parent, maka otomatis class itu child dari class Any
 * Kalau di java, super classnya itu Object, kalau di kotlin namanya Any
 * Function bawaan dari class Any => toString, hashCode
 */

class Smartphone (val jenis: String) // => secara otomatis Anyclass16 : Any
class Laptop (val jenis: String) // => secara otomatis Anyclass16 : Any

// Any juga bisa jadi parameter, dan bisa diisi type data apapun
fun printObj(any: Any) {
    println(any)
}

fun main() {
    val ipon = Smartphone("Iphone")
    println(ipon.toString())
    println(ipon.hashCode())

    printObj('A')
    printObj("Esi")
    printObj(1)
    printObj(11000000000)
}
