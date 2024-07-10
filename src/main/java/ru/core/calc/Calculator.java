package ru.core.calc;

/**
 * Method and variables.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(plus(1, 3));
        System.out.println(plus(4, 2));
    }

    public static int plus(int first, int second) {
        return first + second;
    }
}