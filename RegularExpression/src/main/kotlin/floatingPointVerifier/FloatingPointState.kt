package floatingPointVerifier

interface FloatingPointState {
    fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier)
}