package `41-50`

import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/**
 * Reflection adalah kemampuan melihat struktur aplikasi pada saat berjalan
 * Berguna ketika kita membuat library / framework
 *
 */



// validasi menggunakan reflection
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank

data class Reflection47 (
    @NotBlank val id: String,
    val name: String,
    val price: Long
)

fun validateReflection(request: Any){
    val clazz = request::class // ini Reflection
    val properties = clazz.memberProperties

    for (property in properties){
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when (value){
                is String -> {
                        if ("" == value){
                        throw Exception44("${property.name} is blank")
                    }
                }
            }
        }
    }
}



fun main() {
    val request = Reflection47("1","Jomel",100_000)
    validateReflection(request)

    val request2 = Reflection47("","Esi",100_000)
    validateReflection(request2)


}
