package org.example;

public class Fibonacci {


    public static long calculateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are invalid!");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

