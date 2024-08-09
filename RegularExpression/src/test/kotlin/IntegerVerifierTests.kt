import integerVerifier.IntegerVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IntegerVerifierTests {
    val verifier = IntegerVerifier()

    @Test
    fun testIntegerVerifierTrue() {
        assertEquals(true, verifier.verify("1"))
        assertEquals(true, verifier.verify("12345"))
        assertEquals(true, verifier.verify("12349087612349876123498761234987612349876"))
        assertEquals(true, verifier.verify("3452342352434534524346"))
    }

    @Test
    fun testIntegerVerifierFalse() {
        assertEquals(false, verifier.verify(""))
        assertEquals(false, verifier.verify("1234a"))
        assertEquals(false, verifier.verify("a123"))
        assertEquals(false, verifier.verify("abcd"))
        assertEquals(false, verifier.verify("0"))
        assertEquals(false, verifier.verify("0123456"))
        assertEquals(false, verifier.verify("123122.22322"))
    }
}