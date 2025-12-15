package mate.academy

private const val ADULT_AGE = 18

// Please, do not modify this class!
class Person(val name: String, val age: Int)

val Person.isAdult: Boolean
    get() = age >= ADULT_AGE

