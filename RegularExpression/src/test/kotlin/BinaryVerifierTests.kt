import binaryVerifier.BinaryVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BinaryVerifierTests {
    private val verifier = BinaryVerifier()

    @Test
    fun testBinaryVerifierTrue() {
        assertEquals(true, verifier.verify("1"))
        assertEquals(true, verifier.verify("11"))
        assertEquals(true, verifier.verify("101"))
        assertEquals(true, verifier.verify("111111111111"))
        assertEquals(true, verifier.verify("10011010001"))
    }

    @Test
    fun testBinaryVerifierFalse() {
        assertEquals(false, verifier.verify("0"))
        assertEquals(false, verifier.verify("01"))
        assertEquals(false, verifier.verify("10"))
        assertEquals(false, verifier.verify("1000010"))
        assertEquals(false, verifier.verify("100a01"))
        assertEquals(false, verifier.verify("101a"))
        assertEquals(false, verifier.verify("10c"))
        assertEquals(false, verifier.verify("101$"))
        assertEquals(false, verifier.verify("10@GGGG"))
    }
}