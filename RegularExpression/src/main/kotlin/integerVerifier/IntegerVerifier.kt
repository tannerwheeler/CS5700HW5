package integerVerifier

class IntegerVerifier {
    lateinit var state: IntegerState

    fun verify(string: String): Boolean {
        state = FirstDigit()
        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidInteger
    }
}