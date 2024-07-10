package ru.core.convert;
/**
 * Basic converter.
 */
public class Converter {
    public static float rubToDol(float value) {
        return value / 88;
    }

    public static float rubToEuro(float value) {
        return value / 95;
    }

    public static void main(String[] args) {
        System.out.println(rubToDol(196));
        System.out.println(rubToEuro(1000));
    }
}