package floatingPointVerifier

class InvalidFloatingPoint: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        // Do not leave this state once you are in it.
    }
}