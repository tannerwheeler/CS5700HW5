package emailVerifier

class Period: EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char !in " @.") {
            emailVerifier.state = ValidEmail()
        } else {
            emailVerifier.state = InvalidEmail()
        }
    }
}