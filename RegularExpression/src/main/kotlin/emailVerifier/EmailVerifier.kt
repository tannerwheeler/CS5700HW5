package emailVerifier

class EmailVerifier {
    lateinit var state: EmailState

    fun verify(string: String): Boolean {
        state = StartEmail()

        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidEmail
    }
}