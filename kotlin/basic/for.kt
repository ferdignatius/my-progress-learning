package pengulangan4

fun main() {
//    for array
    var total: Byte = 0
    val peoples: Array<String> = arrayOf("ferdi", "esii", "andika")
    for (person in peoples) {
        println(person)
        total++
    }
    println("Total orang ada = $total" )

    println("=========")

//    for range
    for (i in 0..5){
        println(i)
    }
    println("=========")


    for (a in 0..10 step 2){
        println(a)
    }
    println("=========")


//    for kombinasi
    val panjangArray= peoples.size - 1
    for (x in 0..panjangArray){
        println("Index ke $x = ${peoples.get(x)}")
    }
}