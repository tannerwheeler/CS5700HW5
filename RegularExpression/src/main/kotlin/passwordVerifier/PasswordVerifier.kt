package passwordVerifier

import Verifier

class PasswordVerifier: Verifier {
    lateinit var state: PasswordState
    lateinit var capital: PasswordState
    lateinit var special: PasswordState

    val specials : String = "(!@#\$%&*)"

    override fun verify(string: String): Boolean {
        state = StartPassword()
        capital = NoCapital()
        special = NoSpecial()

        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidPassword
    }
}