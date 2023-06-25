package `41-50`

/**
 * Kotlin mendukung overloading, tidak seperti Java
 * Intinya kita bisa membuat function dari operator-operator seperti operator matematika, dan lain
 * Kemampuan ini membuat kita mampu membuat operasi baru
 *
 * Syaratnya : harus ada kata kunci operator sebelum functionnya
 */

data class OperatorOverloading42 ( val value1:Int){
    operator fun plus(operator: OperatorOverloading42): OperatorOverloading42{
        return OperatorOverloading42(this.value1 + operator.value1)
    }
}


fun main() {
    val operasi1 = OperatorOverloading42(10)
    val operasi2 = OperatorOverloading42(50)

//    kalau gak pakai
    println(operasi1.plus(operasi2))

//    kalau pakai
    println(operasi1 + operasi2 + operasi1)
}