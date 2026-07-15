object Bob {
    fun hey(input: String): String {
        val isYelling =
            input == input.uppercase() && input != input.lowercase()
        val isQuestion = input.trim().endsWith("?")
        return when {
            input.isBlank() -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isYelling -> "Whoa, chill out!"
            isQuestion -> "Sure."
            else -> "Whatever."
        }
    }
}
