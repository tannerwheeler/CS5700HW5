package passwordVerifier

class NotValidSubStates: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        passwordVerifier.capital.consumeCharacter(char, passwordVerifier)
        passwordVerifier.special.consumeCharacter(char, passwordVerifier)

        if (char in passwordVerifier.specials) {
            passwordVerifier.state = Special()
        } else if (passwordVerifier.capital is ValidCapital && passwordVerifier.special is ValidSpecial) {
            passwordVerifier.state = ValidPassword()
        }
    }
}