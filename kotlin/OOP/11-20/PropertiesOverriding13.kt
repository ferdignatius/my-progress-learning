package `11-20`

/**
 * Kita bisa membuat ulang properties
 * Secara standart, properties itu defaultnya final, karena itu kita pakai open
 */

// Parent class
open class PropertiesOverriding {
    open val p = -1
}


// Child class
class q: PropertiesOverriding() {
    override val p = -3
}

class x: PropertiesOverriding() {
    override val p = 0
}

fun main() {
    println(PropertiesOverriding().p)
    println(q().p)
    println(x().p)
}