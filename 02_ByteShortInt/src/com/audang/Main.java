package com.audang;

public class Main {

    public static void main(String[] args) {
/*
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
*/

        byte myByte = 100;
        short myShort = 20000;
        int myInt = 253_234_234;
        long myLong = 50000L + (10 * (myByte + myShort + myInt));
        System.out.println(myLong);


    }
}
