package emailVerifier

interface EmailState {
    fun consumeCharacter(char: String, emailVerifier: EmailVerifier)
}