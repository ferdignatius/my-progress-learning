package `41-50`

/**
 * Kotlin memiliki standar library yg digunakan untuk mengeksekusi objek dengan mudah memanfaatkan lambda
 * Function-Functionnya adalah
 */

class ScopeFunction48(val name: String, val kelas: Int)

fun main() {
    /**
     * Let function => digunakan sebagai refrensi block agar lebih mudah dalam memanipulasi objek
     * Ada kata kunci it di Let function
     */
    val student = ScopeFunction48("Esi", 12)
    student.let {
        println(it.name)
        println(it.kelas)
    }

    /**
     * Run function => mirip let, tapi pada run function tidak ada parameter pada lambda, tapi pakai this
     */
    student.run {
        println(this.name)
        println(this.kelas)
    }

    /**
     * Apply function => mirip run, tapi return valuenya ada refrensi objek itu sendiri
     */
    student.apply {
        println(this.name)
        println(this.kelas)
    }

    /**
     * Also function => mirip let, tapi return valuenya adalah refrensi objek itu sendiri
     */
    student.also {
        println(it.name)
        println(it.kelas)
    }

    /**
     * With function => mirip run, tapi gak bisa digunakan langsung dari objeknya
     */
    with(student) {
        println(this.name)
        println(this.kelas)
    }

}