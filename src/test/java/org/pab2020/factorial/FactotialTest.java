package org.pab2020.factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Defincir que querer
 * 0->1
 * 1->1
 * 2->2
 * negativ0->??
 * 4->24
 */
class FactotialTest {

    private Factorial factorial;
    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }


    @Test
    public void shouldFactorial0Return1() {
        long expectedValue = 1;
        long obtainedValue = factorial.compute(0);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFactorial1Return1() {
        long expectedValue = 1;
        long obtainedValue = factorial.compute(1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFactorial2Return2() {
        long expectedValue = 2;
        long obtainedValue = factorial.compute(2);
        assertEquals(expectedValue, obtainedValue);
        //si on reales te pide presicion delta
        //assertTrue
    }

    @Test
    public void shouldFactorial4Return24() {
        long expectedValue = 24;
        long obtainedValue = factorial.compute(4);
        assertEquals(expectedValue, obtainedValue);
    }
    @Test
    public void shouldFactorialOfNegativeNumberRaiseException() {

        assertThrows(RuntimeException.class,() -> factorial.compute(-1));
    }




}