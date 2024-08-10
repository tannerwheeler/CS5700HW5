package passwordVerifier

class NoSpecial: SubState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in passwordVerifier.specials) {
            passwordVerifier.special = ValidSpecial()
        }
    }
}