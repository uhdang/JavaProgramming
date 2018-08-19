package com.audang;

public class Ex06_TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int one, int two, int three) {
        return inRange(one) || inRange(two) || inRange(three);
    }

    public static boolean inRange(int num) {
        return num >= 13 && num <= 19;
    }
}
