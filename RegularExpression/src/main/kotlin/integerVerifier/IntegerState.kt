package integerVerifier

interface IntegerState {
    fun consumeCharacter(char: String, integerVerifier: IntegerVerifier)
}