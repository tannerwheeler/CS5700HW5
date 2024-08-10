import floatingPointVerifier.FloatingPointVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FloatingPointVerifierTests {
    private val verifier = FloatingPointVerifier()

    @Test
    fun testFloatingPointVerifierTrue() {
        assertEquals(true, verifier.verify("1.0"))
        assertEquals(true, verifier.verify("123.34"))
        assertEquals(true, verifier.verify("0.20000"))
        assertEquals(true, verifier.verify("12349871234.12340981234098"))
        assertEquals(true, verifier.verify(".123"))
        assertEquals(true, verifier.verify(".23"))
        assertEquals(true, verifier.verify("5788838499595959.9987737"))
    }

    @Test
    fun testFloatingPointVerifierFalse() {
        assertEquals(false, verifier.verify("123"))
        assertEquals(false, verifier.verify("123.123."))
        assertEquals(false, verifier.verify("123.02a"))
        assertEquals(false, verifier.verify("123."))
        assertEquals(false, verifier.verify("012.4"))
        assertEquals(false, verifier.verify("012.@"))
        assertEquals(false, verifier.verify("!.4"))
        assertEquals(false, verifier.verify("0#2.4"))
        assertEquals(false, verifier.verify("."))
        assertEquals(false, verifier.verify(". 3"))
        assertEquals(false, verifier.verify("7378388!@@JKDJDJ8484748.99548494"))
    }
}