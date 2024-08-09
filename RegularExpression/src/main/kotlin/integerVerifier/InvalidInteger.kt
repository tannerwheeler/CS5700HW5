package integerVerifier

class InvalidInteger: IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        // Do nothing, do not leave this state once in it.
    }
}