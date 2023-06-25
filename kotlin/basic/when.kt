package operasi2

fun main() {
    var nilai = 'A'

    when (nilai) {
        'A' -> {
            println("Perfect")

        }
        'B' -> println("Good")
        'C' -> println("Miss")
        'D' -> println("Try again")
        else -> println("HAH?")
    }

//    Multiple option
    val finalNilai = 'C'
    when (finalNilai){
        'A', 'B', 'C' -> println("Lulus")
        else -> println("tidak lulus")
    }

//    in
    val hasilAkhir = 'A'
    val passed: Array<Char> = arrayOf('A','B','C')
    when (hasilAkhir){
        in passed -> println("lulus")
        !in passed -> println("tidak lulus")
    }

//    is
    val nama = "1"
    when (nama){
        is String -> println("tipe datanya string")
        !is String -> println("tipe datanya bukan string")
    }
}