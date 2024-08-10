package passwordVerifier

import Verifier

class PasswordVerifier: Verifier {
    lateinit var state: PasswordState
    lateinit var capital: SubState
    lateinit var special: SubState

    val specials : String = "!@#\$%&*"

    override fun verify(string: String): Boolean {
        state = StartPassword()
        capital = NoCapital()
        special = NoSpecial()

        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return (state is ValidPassword &&
                capital is ValidCapital &&
                special is ValidSpecial)
    }
}