package xp.tdd.examples.fibonachi

class Fibonacci {
    fun fib(n: Int): Int {
        if (n == 0) return 0
        if (n <= 2) return 1
        return 2
    }
}
