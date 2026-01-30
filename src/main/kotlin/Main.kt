private const val ADULT_AGE = 18

// Please, do not modify this class!
class Person(
    val name: String,
    val age: Int
)

// Extension property
val Person.isAdult: Boolean
    get() = this.age >= ADULT_AGE

