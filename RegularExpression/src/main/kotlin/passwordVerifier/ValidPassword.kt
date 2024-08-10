package passwordVerifier

class ValidPassword: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in passwordVerifier.specials) {
            passwordVerifier.state = Special()
        }
    }
}