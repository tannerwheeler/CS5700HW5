package passwordVerifier

interface SubState {
    fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier)
}