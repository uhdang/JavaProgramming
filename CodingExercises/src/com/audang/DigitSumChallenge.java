package com.audang;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println("#####################");
        System.out.println(sumDigitV2(125));
        System.out.println(sumDigitV2(1));
        System.out.println("-----------------------");
        System.out.println(sumDigitClean(125));
        System.out.println(sumDigitClean(1));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        String[] stringArray = Integer.toString(number).split("");
        int sum = 0;

        for (int i = 0; i < stringArray.length; i++) {
            int digit = Integer.parseInt(stringArray[i]);
            sum += digit;
        }

        return sum;
    }

    public static int sumDigitV2(int number) {
        if (number < 10) {
            return -1;
        }

        int length = String.valueOf(number).length();
        int changingNum = number;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += changingNum % 10;
            changingNum /= 10;
        }
        return sum;
    }

    public static int sumDigitClean(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while(number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
