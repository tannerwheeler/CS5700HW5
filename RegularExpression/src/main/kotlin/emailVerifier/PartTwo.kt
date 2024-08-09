package emailVerifier

class PartTwo: EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char == ".") {
            emailVerifier.state = Period()
        } else if (char in " @") {
            emailVerifier.state = InvalidEmail()
        }
    }
}