package FibonacciTest;

import fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pab2020.factorial.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * implement Test for Fibonacci Series
 * F0->0
 * F1->1
 * F2->2
 * negative->??
 *
 */
public class FibonnacciTest {
    private Fibonacci fibonacci;
    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @Test
    public void shouldFibonacci0Return0() {
        long expectedValue = 0;
        long obtainedValue = fibonacci.compute(0,1);
        assertEquals(expectedValue, obtainedValue);
    }
    @Test
    public void shouldFibonacci1k1Return1() {
        long expectedValue = 1;
        long obtainedValue = fibonacci.compute(1,1);
        assertEquals(expectedValue, obtainedValue);
    }
    @Test
    public void shouldFibonacci2k1Return1() {
        long expectedValue = 1;
        long obtainedValue = fibonacci.compute(2,1);
        assertEquals(expectedValue, obtainedValue);
    }
    @Test
    public void shouldFibonacciOfNegativeNumberRaiseException() {
        assertThrows(RuntimeException.class,() -> fibonacci.compute(-1,1));
    }
    @Test
    public void shouldFibonacciHigherValue40RaiseException() {
        assertThrows(RuntimeException.class,() -> fibonacci.compute(41,1));
    }
    @Test
    public void shouldFibonacciHigherK5RaiseException() {
        assertThrows(RuntimeException.class,() -> fibonacci.compute(3,6));
    }
    @Test
    public void shouldFibonacci4k1Return3() {
        long expectedValue = 3;
        long obtainedValue = fibonacci.compute(4,1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibonacci5k3Return19() {
    long expectedValue = 19;
    long obtainedValue = fibonacci.compute(5,3);
    assertEquals(expectedValue, obtainedValue);
    }

}
