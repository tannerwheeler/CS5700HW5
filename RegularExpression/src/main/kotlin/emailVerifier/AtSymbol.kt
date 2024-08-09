package emailVerifier

class AtSymbol: EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char !in " @.") {
            emailVerifier.state = PartTwo()
        } else {
            emailVerifier.state = InvalidEmail()
        }
    }
}