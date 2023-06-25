package `31-40`

/**
 * Inner class = clas di dalam class
 * Class yg diluar disebut class outer
 * Defaultnya class inner tidak bisa mengakses class outernya, tapi dengan menambahkan inner, bisa
 */

class InnerClass31(val name: String) {

    inner class Employee(val name: String){

        fun bio(){
            println("Hi my name is $name, and my bosss is ${this@InnerClass31.name}")
        }
    }
}

fun main() {
    val boss1 = InnerClass31("Ferdi")
    val employee1 = boss1.Employee("Jomel")

    val boss2 = InnerClass31("Jomel")
    val employee2 = boss2.Employee("Esi")

    employee1.bio()
    employee2.bio()
}