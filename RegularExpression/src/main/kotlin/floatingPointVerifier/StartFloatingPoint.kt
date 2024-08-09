package floatingPointVerifier

class StartFloatingPoint: FloatingPointState {
    override fun consumeCharacter(char: String, floatingPointVerifier: FloatingPointVerifier) {
        if (char in "123456789") {
            floatingPointVerifier.state = Digits()
        } else if (char == "0") {
            floatingPointVerifier.state = Zero()
        } else if (char == ".") {
            floatingPointVerifier.state = Point()
        } else {
            floatingPointVerifier.state = InvalidFloatingPoint()
        }
    }
}