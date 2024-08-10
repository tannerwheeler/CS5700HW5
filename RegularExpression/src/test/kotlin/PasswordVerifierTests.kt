import org.junit.jupiter.api.Test
import passwordVerifier.PasswordVerifier
import kotlin.test.assertEquals

class PasswordVerifierTests {
    private val verifier = PasswordVerifier()

    @Test
    fun testPasswordVerifierTrue() {
        assertEquals(true, verifier.verify("aaaaH!aa"))
        assertEquals(true, verifier.verify("1234567*9J"))
        assertEquals(true, verifier.verify("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
        assertEquals(true, verifier.verify("T123456*a"))
        assertEquals(true, verifier.verify("!234567T"))
        assertEquals(true, verifier.verify("123H%678 "))
        assertEquals(true, verifier.verify("123 456699fkkJJ !3;"))
        assertEquals(true, verifier.verify("AAAAAA!A"))
        assertEquals(true, verifier.verify("AAAAAAB!A"))
        assertEquals(true, verifier.verify("ksdlksdlknnlksdlk)A"))
        assertEquals(true, verifier.verify("ksdlksdlknnlksdlk*##A"))
    }

    @Test
    fun testPasswordVerifierFalse() {
        assertEquals(false, verifier.verify("a"))
        assertEquals(false, verifier.verify("aaaaaaa!"))
        assertEquals(false, verifier.verify("aaaHaaaaa"))
        assertEquals(false, verifier.verify("Abbbbbbb!"))
        assertEquals(false, verifier.verify("AAbbbb!!!!!aaa...@"))
        assertEquals(false, verifier.verify("123H%678*"))
        assertEquals(false, verifier.verify("123 456699fkkJJ !"))
        assertEquals(false, verifier.verify("AAAAAAA!"))
        assertEquals(false, verifier.verify("3883i3kdmj8393kdmkjdk!"))
        assertEquals(false, verifier.verify("828827wjj**#**#((@*!"))
        assertEquals(false, verifier.verify("A"))
        assertEquals(false, verifier.verify("A!"))
        assertEquals(false, verifier.verify("!A"))
        assertEquals(false, verifier.verify("aaaaaaaaaaaaaaaaiiiiiii!!k"))
        assertEquals(false, verifier.verify("ophergnladbn;sbfj9383738&%@jdj"))
        assertEquals(false, verifier.verify("AAADDDkljlkdgjlksjglksdjlj"))
    }
}