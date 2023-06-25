package function5

// menamakan argumen
fun fullname(first: String,
         middle: String = "",
         last: String = "")
{
    println("$first $middle $last")
}

// kalau udah pakai named argumen, maka semuanya wajib pakai named argumen
fun main() {
    fullname(
        last = "Gunawan",
        first = "Chelsea",
        middle = "Laviola"
    )
}