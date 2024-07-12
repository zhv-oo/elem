package ru.core.convert;
/**
 * Basic converter.
 */
public class Converter {
    public static float rubToDol(float value) {
        return value / 88;
    }

    public static float rubToEu(float value) {
        return value / 95;
    }

    public static void main(String[] args) {
        float rubToDollar = rubToDol(176);
        float rubTOEuro = rubToEu(285);
        System.out.println(rubToDollar);
        System.out.println(rubToDollar);
        System.out.println(rubToDollar == 2);
        System.out.println(rubTOEuro == 3);
    }
}