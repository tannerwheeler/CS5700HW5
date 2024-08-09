package emailVerifier

class InvalidEmail: EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        // Do not leave this state once you are in it.
    }
}