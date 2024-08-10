package emailVerifier

import Verifier

class EmailVerifier: Verifier {
    lateinit var state: EmailState

    override fun verify(string: String): Boolean {
        state = StartEmail()

        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidEmail
    }
}