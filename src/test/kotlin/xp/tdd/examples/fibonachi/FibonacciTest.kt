package xp.tdd.examples.fibonachi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun `aaa` () {
        assertThat(Fibonacci.fib(0)).isEqualTo(0)
    }
}