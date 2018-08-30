package com.audang;


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

    public static int[] sortDesc(int[] integerArray) {
        int[] sortedArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            int rank = integerArray.length - 1;
            for (int j = 0; j < integerArray.length; j++) {
                if (integerArray[i] > integerArray[j]) {
                    rank--;
                }
            }
            sortedArray[rank] = integerArray[i];
        }
        return sortedArray;
    }
}
