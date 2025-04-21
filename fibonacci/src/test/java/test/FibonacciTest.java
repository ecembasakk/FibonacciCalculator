package test;

import org.example.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    @Test
    void testCalculateFibonacci() {

        assertEquals(0, Fibonacci.calculateFibonacci(0));
        assertEquals(1, Fibonacci.calculateFibonacci(1));
        assertEquals(55, Fibonacci.calculateFibonacci(10));
        assertEquals(233, Fibonacci.calculateFibonacci(13));
    }

    @Test
    void testInvalidInput() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Fibonacci.calculateFibonacci(-5)
        );
        assertEquals("Negative numbers are invalid!", exception.getMessage());
    }
}
