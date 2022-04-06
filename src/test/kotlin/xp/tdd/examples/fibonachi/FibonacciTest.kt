package xp.tdd.examples.fibonachi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun `Fibonacci returns correct value`() {
        val sut = Fibonacci()
        val inputsAndExpectations = listOf(Pair(0, 0), Pair(1, 1), Pair(2, 1), Pair(3, 2))
        inputsAndExpectations.forEach {
            assertThat(sut.fib(it.first)).isEqualTo(it.second)
        }
    }
}
