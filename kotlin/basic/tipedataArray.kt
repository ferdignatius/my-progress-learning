package tipedata1

fun main() {
//    Array adalah tipe data yang berisi kumpulan data yang tipe datanya sama
    val siswa: Array<String> = arrayOf("Ferdi", "Esii", "Elpan")
    val umur: Array<Byte> = arrayOf(17, 16, 17)

    println(siswa)
    println(umur)


//    Operasi dalam array
//    size => untuk mendapat panjang array
    println(umur.size)
//    get(index) => untuk mendapat data di index
    println(siswa.get(1))
//    [index] => untuk mendapat data di index
    println(siswa[0])
//    set(index, data)
    umur.set(2, 15)
//    [index] = new value
    umur[1] = 14


//    Array Nullable
    val array: Array<String?> = arrayOfNulls(4)
    array[0] = "satu"
    array[1] = null
    array[2] = null
    array[3] = "empat"




}