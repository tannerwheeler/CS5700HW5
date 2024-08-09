package floatingPointVerifier

class Digits: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char == ".") {
            floatingPointVerifier.state = Point()
        } else if (char !in "0123456789") {
            floatingPointVerifier.state = InvalidFloatingPoint()
        }
    }
}