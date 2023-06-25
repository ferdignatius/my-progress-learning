package `11-20`

open class SuperConstructor15 (
    val namaSiswa: String,
    val gelombang: Int
        ) {
    constructor(gelombang: Int): this("", gelombang)
}

class gelombang1: SuperConstructor15{
    constructor(nama: String): super(nama,0)
    constructor(gelombang: Int): super("", gelombang)
    constructor(nama: String, gelombang: Int): super(nama, gelombang)
}


fun main() {
    println(gelombang1("Ferdinand").namaSiswa)
    println(gelombang1(1).gelombang)
    println(gelombang1("Esi",2).namaSiswa)
    println(gelombang1("Esi",2).gelombang)
}