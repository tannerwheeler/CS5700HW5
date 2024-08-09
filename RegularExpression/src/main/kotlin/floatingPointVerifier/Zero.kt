package floatingPointVerifier

class Zero: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char == ".") {
            floatingPointVerifier.state = Point()
        } else {
            floatingPointVerifier.state = InvalidFloatingPoint()
        }
    }
}