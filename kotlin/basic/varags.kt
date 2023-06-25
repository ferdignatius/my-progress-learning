package function5

fun totalBelanja(nama: String, vararg values: Int) {
    var total = 0
        for (value in values){
            total += value
        }
    println("Atas nama $nama dengan total belanja Rp $total ")

}

fun jumlahTotal(vararg values: Int): Int {
    var total = 0
        for (value in values){
            total += value
        }
    return total

}

fun main() {
    totalBelanja("Ferdi", 10_000,25_000,30_000,5_000,100_000)
    println(jumlahTotal(1,2,3,4,5,6,7,8,9,10))
}