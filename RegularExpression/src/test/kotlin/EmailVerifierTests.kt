import emailVerifier.EmailVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EmailVerifierTests {
    private val verifier = EmailVerifier()

    @Test
    fun testEmailVerifierTrue() {
        assertEquals(true, verifier.verify("a@b.c"))
        assertEquals(true, verifier.verify("joseph.ditton@usu.edu"))
        assertEquals(true, verifier.verify("{}*\$.&\$*(@*\$%&.*&*"))
    }

    @Test
    fun testEmailVerifierFalse() {
        assertEquals(false, verifier.verify("@b.c"))
        assertEquals(false, verifier.verify("a@b@c.com"))
        assertEquals(false, verifier.verify("a.b@b.b.c"))
        assertEquals(false, verifier.verify("joseph ditton@usu.edu"))
        assertEquals(false, verifier.verify(" @b.c"))
        assertEquals(false, verifier.verify("a@.c"))
        assertEquals(false, verifier.verify("a@b."))
        assertEquals(false, verifier.verify("a@b.."))
        assertEquals(false, verifier.verify("a@ .c"))
        assertEquals(false, verifier.verify("a@b. "))
    }
}