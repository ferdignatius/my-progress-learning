package `41-50`

/**
 * Kita bisa menggunakan framework Java di Kotlin
 * Jadi dikotlin kita bisa @target:NamaAnnotation nya untuk menentukan lokasi target
 */

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ContohTarget(
    @field:Beta val firstname: String,
    @param:Beta val lastname: String,
    @Beta val gender: String
    ) {
}