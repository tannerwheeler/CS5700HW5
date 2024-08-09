package binaryVerifier

class ValidBinary: BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "0") {
            binaryVerifier.state = Zero()
        } else if (char !in "01") {
            binaryVerifier.state = InvalidBinary()
        }
    }
}