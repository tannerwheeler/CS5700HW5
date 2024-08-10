package passwordVerifier

class NoSpecial: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in passwordVerifier.specials) {
            passwordVerifier.special = ValidSpecial()
        }
    }
}