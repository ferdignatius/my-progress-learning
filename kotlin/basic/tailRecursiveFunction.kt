package function6

// kelemahan recursive function adalah error stack overflow jika recursive terlalu dalam
// solusinya di kotlin adalah tail recursive function -> kotlin kompile recursive function
// Syaratnya : tambahkan tailrec, dan hanya boleh memanggil fucntionnya sendiri

fun main() {
    tailrec fun display(value: Int){
        println("recursive ke $value")
        if (value > 0 ){
            display(value - 1)
        }
    }

    display(10);

//     nge tail function recursive di sebelumnya
    tailrec fun faktorialRecursive(angka: Int, total: Int = 1): Int{
        return when(angka){
            1 -> total
            else -> faktorialRecursive(angka - 1, total * angka)
        }
    }

    println(faktorialRecursive(5))
}