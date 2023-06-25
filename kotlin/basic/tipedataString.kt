package tipedata1

fun main() {
// Sring => pakai "
    var sayHello: String = "Hello Ferdinand"
    var address: String = """
        Pangkalan,
        Teluknaga,
        Tangerang,
        Banten
    """

    println(sayHello)
    println(address)

// String trim margin => menghapus bagian sebelum yang ditandai
    var address2: String = """
        Ferdinand
        | Ignatius
        | Surya
    """.trimMargin("|")    // hapus bagian sebelum |

//    Menggabungkan string => pakai +
    var firstName: String = "Ferdinand"
    var lastName: String = "Ignatius"
    var fullName: String = firstName + ' ' + lastName
    println(fullName)

//    atau bisa gini
    var fullName2: String = "$firstName $lastName"
    var fullNameLength: String = "$fullName2 length = ${fullName2.length}"



}