package passwordVerifier

class Six: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = Seven()
        passwordVerifier.capital.consumeCharacter(char, passwordVerifier)
        passwordVerifier.special.consumeCharacter(char, passwordVerifier)
    }
}