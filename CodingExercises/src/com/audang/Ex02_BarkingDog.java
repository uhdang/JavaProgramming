package com.audang;

public class Ex02_BarkingDog {
    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}
