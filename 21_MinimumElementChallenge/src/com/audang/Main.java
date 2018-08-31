package com.audang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name ÅeMinElementChallengeÅf

        System.out.println("Enter count: " );
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] intArray = readIntegers(count);

        System.out.println("Stringified Array - " + Arrays.toString(intArray));
        System.out.println("Minimum value is " + findMin(intArray));

    }

    public static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static int findMin(int[] intArray) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}
