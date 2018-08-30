package com.audang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        int[] sortedIntArray = sortDesc(intArray);
        printArray(sortedIntArray);
    }

    public static int[] getIntegers(int num) {
        System.out.println("Enter " + num + " integer values.\r");
        int[] intArray = new int[num];

        for (int i=0; i<5; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println((i+1) + "Printing out - " + intArray[i]);
        }
    }

    public static int[] sortDesc(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
