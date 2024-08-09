package emailVerifier

class ValidEmail: EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char in " @.") {
            emailVerifier.state = InvalidEmail()
        }
    }
}