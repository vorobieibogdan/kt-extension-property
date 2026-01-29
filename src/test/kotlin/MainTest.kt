import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
class MainTest {

    @Test
    fun `Person is adult when age is 18`() {
        val person = Person("Alice", 18)
        assertTrue(person.isAdult, "Person should be considered an adult at age 18")
    }

    @Test
    fun `Person is adult when age is over 18`() {
        val person = Person("Bob", 25)
        assertTrue(person.isAdult, "Person should be considered an adult when age is over 18")
    }

    @Test
    fun `Person is not adult when age is under 18`() {
        val person = Person("Charlie", 17)
        assertFalse(person.isAdult, "Person should not be considered an adult when age is under 18")
    }
}


