package emailVerifier

class PartOne: EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char == " ") {
            emailVerifier.state = InvalidEmail()
        } else if (char == "@") {
            emailVerifier.state = AtSymbol()
        }
    }
}