package passwordVerifier

class Three: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = Four()
        passwordVerifier.capital.consumeCharacter(char, passwordVerifier)
        passwordVerifier.special.consumeCharacter(char, passwordVerifier)
    }
}