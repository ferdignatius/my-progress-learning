package `21-30`

/**
 * Saat membuat abstract class, maka kita bisa membuat abstract properties & function di dalamnya
 * Artinyam kita harus buat properties & function itu lagi di child
 */

abstract class AbstractPropertiesFunction{
    abstract val nama: String
    abstract fun run(): Unit
}

class Toyota: AbstractPropertiesFunction() {
    // Kalau gak di override, maka child akan error
    override val nama = "Toyota"
    override fun run() {
        println("$nama Run Engine")
    }
}

class Honda: AbstractPropertiesFunction() {
    override val nama = "Honda"
    override fun run() {
        println("$nama BRRRRRRRRRR")
    }
}

fun main() {
    val toyota = Toyota()
    println(toyota.run())
    val honda = Honda()
    println(honda.run())

}