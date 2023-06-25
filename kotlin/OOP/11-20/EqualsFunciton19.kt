package `11-20`

/**
 * Di kotlin, semua objek bisa dibandingkan dengan operasi == atau !=
 * == dan != adalah function milik any
 * kita bisa mengoverride function equals
 */

open class EqualsFunciton19 (val name: String){
    override fun equals(other: Any?): Boolean {
        return when(other){
            is EqualsFunciton19 -> other.name == this.name
            else -> false
        }
    }
}

fun main() {
    val equal1 = EqualsFunciton19("Jakarta")
    val equal2 = EqualsFunciton19("Banten")

    println(equal1 == equal2)
    println(equal1 == equal1)
    println(equal1 != equal2)
}
