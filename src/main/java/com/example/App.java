package com.example;

/** Small application used to test a Java CI pipeline. */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello from the GitHub Actions Java demo!");
        System.out.println("2 + 3 = " + add(2, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
