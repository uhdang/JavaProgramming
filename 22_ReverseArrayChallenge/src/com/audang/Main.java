package com.audang;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6};
        System.out.println("Before");
        System.out.println(Arrays.toString(intArray));

        reverse(intArray);

        System.out.println("After");
        System.out.println(Arrays.toString(intArray));
    }

    public static void reverse(int[] intArray) {
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp;
            int end = intArray.length - 1 - i;
            temp = intArray[i];
            intArray[i] = intArray[end];
            intArray[end] = temp;
        }
    }
}
