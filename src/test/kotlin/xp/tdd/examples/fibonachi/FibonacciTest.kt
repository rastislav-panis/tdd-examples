package xp.tdd.examples.fibonachi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun `Fibonacci returns correct value`() {
        val sut = Fibonacci()
        assertThat(sut.fib(0)).isEqualTo(0)
    }
}
