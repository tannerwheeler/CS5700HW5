package binaryVerifier

interface BinaryState {
    fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier)
}