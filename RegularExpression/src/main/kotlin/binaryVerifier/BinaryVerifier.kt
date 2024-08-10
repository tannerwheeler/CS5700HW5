package binaryVerifier

import Verifier

class BinaryVerifier: Verifier {
    lateinit var state: BinaryState

    override fun verify(string: String): Boolean {
        state = StartBinary()
        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidBinary
    }
}