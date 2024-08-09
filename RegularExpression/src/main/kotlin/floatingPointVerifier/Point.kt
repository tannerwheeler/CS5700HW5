package floatingPointVerifier

class Point: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char in "0123456789") {
            floatingPointVerifier.state = ValidFloatingPoint()
        }
    }
}