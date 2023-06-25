package operasi2

fun main() {
//    +, -, *, / , %
//    hasilnya akan menyesuaikan dengan tipe datanya
    var hasilBagi = 10/3
    println(hasilBagi)

    var hasilBagi2 = 10.0/3.0
    println(hasilBagi2)



//    augmented assignment
//    a = a + 10
//      => a+=10
//    berlaku di operasi matematika manapun

    var total: Int = 0
    println(total)

    total += 100
    println(total)


//    unary operator
//    ++ => +1
//    -- => -1
//    ! => kebalikan boolean

    var barang: Int = -1
    barang++
    println(barang)
    barang--
    println(barang)

    val bagus = true
    println(!bagus)
}
