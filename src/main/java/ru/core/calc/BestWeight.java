package ru.core.calc;

public class BestWeight {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println(manWeight(190));
        System.out.println(womanWeight(164));
    }
}
