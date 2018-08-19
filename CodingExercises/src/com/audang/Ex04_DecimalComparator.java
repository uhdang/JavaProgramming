package com.audang;

public class Ex04_DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int afterOne = (int) (one * 1000);
        int afterTwo = (int) (two * 1000);
        System.out.println(afterOne);
        System.out.println(afterTwo);
        return afterOne == afterTwo;
    }
}
