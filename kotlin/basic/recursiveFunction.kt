package function5

// adalah function yang memanggil dirinya sendiri

fun main() {
//    faktorial dengan recursive function
    fun faktorialRecursive(angka: Int): Int{
        return when(angka){
            1 -> 1
            else -> angka * faktorialRecursive(angka - 1)
        }
    }

//    faktorial dengan for loop

    fun faktorialFor(angka: Int): Int{
        var result = 1
        for (i in angka downTo 1){
            result *= i
        }
        return result
    }

    println(faktorialRecursive(5))
    println(faktorialFor(5))
}