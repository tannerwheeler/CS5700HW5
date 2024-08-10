package integerVerifier

import Verifier

class IntegerVerifier: Verifier {
    lateinit var state: IntegerState

    override fun verify(string: String): Boolean {
        state = FirstDigit()
        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidInteger
    }
}