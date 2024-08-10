package passwordVerifier

class NoCapital: PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            passwordVerifier.capital = ValidCapital()
        }
    }
}