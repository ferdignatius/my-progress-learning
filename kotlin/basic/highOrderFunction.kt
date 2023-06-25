package function6

// High order function -> lambda yang berada di dalam parameter

fun hello(value: String, transform: (String) -> String): String {
    return "Hello ${transform(value)}"
}

fun main() {


    val uppercase = { value: String -> value.uppercase()}
    val lowercase = { value: String -> value.lowercase()}

    println(hello("ferdi", uppercase))
    println(hello("ESII", lowercase))
    println(hello("ESII", {value: String -> value.lowercase() }))

//     trailing lambda -> cara penulisan lambda kalau lambdanya berada di akhir argumen
    val result = hello("Chelsea") {value: String -> value.uppercase()}
}