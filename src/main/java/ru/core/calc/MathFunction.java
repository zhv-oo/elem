package ru.core.calc;

import static ru.core.condition.Point.distance;

/**
 * return param.
 */
public class MathFunction {

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        System.out.println(MathFunction.func1(3));
        System.out.println(MathFunction.func2(5));
        System.out.println(distance(0, 0, 4, 0));
    }
}
