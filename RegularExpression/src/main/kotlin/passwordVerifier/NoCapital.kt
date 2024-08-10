package passwordVerifier

class NoCapital: SubState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            passwordVerifier.capital = ValidCapital()
        }
    }
}