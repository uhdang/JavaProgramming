package com.audang;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 5; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("YES: " + i);
            }
            System.out.println(count);
            if (count == 5) {
                System.out.println("Reached 5 when " + i + " . Sum is " + sum);
                break;
            }
        }
    }
}
