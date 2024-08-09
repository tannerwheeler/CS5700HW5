package binaryVerifier

class Zero: BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1") {
            binaryVerifier.state = ValidBinary()
        } else if (char !in "01") {
            binaryVerifier.state = InvalidBinary()
        }
    }
}