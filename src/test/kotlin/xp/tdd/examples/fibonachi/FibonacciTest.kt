package xp.tdd.examples.fibonachi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun `Fibonacci returns correct value`() {
        val sut = Fibonacci()
        val inputs = listOf(0, 1)
        inputs.forEach {
            assertThat(sut.fib(it)).isEqualTo(it)
        }
    }
}
