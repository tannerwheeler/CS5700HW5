package passwordVerifier

class Special: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.capital.consumeCharacter(char, passwordVerifier)

        if (char in passwordVerifier.specials) {
            return
        } else if (passwordVerifier.capital is ValidCapital) {
            passwordVerifier.state = ValidPassword()
        } else {
            passwordVerifier.state = NotValidSubStates()
        }
    }
}