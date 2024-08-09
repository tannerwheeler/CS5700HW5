package floatingPointVerifier

class FloatingPointVerifier {
    lateinit var state: FloatingPointState

    fun verify(string: String): Boolean {
        state = StartFloatingPoint()

        string.forEach {
            state.consumeCharacter(it.toString(), this)
        }
        return state is ValidFloatingPoint
    }
}