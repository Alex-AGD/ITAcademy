package com.HomeLesson;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 20;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;

        }
    }
}