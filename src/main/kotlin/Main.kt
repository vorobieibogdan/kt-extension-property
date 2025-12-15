private const val ADULT_AGE = 18

val Person.isAdult: Boolean
    get() = age >= ADULT_AGE

// Please, do not modify this class!
class Person(val name: String, val age: Int)
