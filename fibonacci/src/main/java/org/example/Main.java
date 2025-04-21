package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Which element of the Fibonacci series would you like to see? (positive integer): ");
        int n = scanner.nextInt();

        try {

            long result = Fibonacci.calculateFibonacci(n);
            System.out.println(n + ". Fibonacci Number: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
