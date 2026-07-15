object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require (start > 0) { "Only positive integers are valid!" }
        return computeStepCount(start, 0)
    }

    private tailrec fun computeStepCount(n: Int, count: Int): Int =
        when {
            n == 1     -> count
            n.isEven() -> computeStepCount(n / 2, count + 1)
            else       -> computeStepCount(n * 3 + 1, count + 1)
        }

    fun Int.isEven() = this % 2 == 0
}
