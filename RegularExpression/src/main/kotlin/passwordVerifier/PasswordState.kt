package passwordVerifier

interface PasswordState {
    abstract fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier)
}