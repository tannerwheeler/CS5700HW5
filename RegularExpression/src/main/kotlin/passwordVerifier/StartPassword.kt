package passwordVerifier

class StartPassword: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = One()
        passwordVerifier.capital.consumeCharacter(char, passwordVerifier)
        passwordVerifier.special.consumeCharacter(char, passwordVerifier)
    }
}