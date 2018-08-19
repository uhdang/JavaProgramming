package com.audang;

public class Main {

    public static void main(String[] args) {
        /*
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f; // 'f' for float
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d; // 'd' for double

        // Java as a default sets decimal number as 'double'
        float myFloatValueOne = (float) 5.4;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue); // 7 decimal precision
        System.out.println("myDoubleValue = " + myDoubleValue); // 16 decimal precision

        // FASTER using double for modern computers
        */

        double myPound = 200d;
        double poundToKiloRate = 0.45359237d;
        double inKg = myPound * poundToKiloRate;
        System.out.println("Converted: " + inKg);
        double pi = 3.141_592_7d;
    }
}
