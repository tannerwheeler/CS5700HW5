package emailVerifier

class StartEmail: EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char !in " @") {
            emailVerifier.state = PartOne()
        } else {
            emailVerifier.state = InvalidEmail()
        }
    }
}