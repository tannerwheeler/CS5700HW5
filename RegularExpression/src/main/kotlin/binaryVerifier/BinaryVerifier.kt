package binaryVerifier

class BinaryVerifier {
    lateinit var state: BinaryState

    fun verify(string: String): Boolean {
        state = StartBinary()
        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidBinary
    }
}