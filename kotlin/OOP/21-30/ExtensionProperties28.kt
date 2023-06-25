package `21-30`

/**
 * Selain function, kita juga dapat membuat properties extension
 * Kita bisa membuat properties extension dengan getter dan setter
 */

class ExtensionProperties28 (val name: String)

val ExtensionProperties28.upperName: String
    get() = this.name.toUpperCase()


fun main() {
    val properties1 = ExtensionProperties28("Jomel")
    println(properties1.upperName)
}