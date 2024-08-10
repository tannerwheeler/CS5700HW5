package passwordVerifier

class One: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.state = Two()
        passwordVerifier.capital.consumeCharacter(char, passwordVerifier)
        passwordVerifier.special.consumeCharacter(char, passwordVerifier)
    }
}