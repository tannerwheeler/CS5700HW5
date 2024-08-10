package floatingPointVerifier

import Verifier

class FloatingPointVerifier: Verifier {
    lateinit var state: FloatingPointState

    override fun verify(string: String): Boolean {
        state = BeginFloatingPoint()

        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidFloatingPoint
    }
}