package com.audang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;

        // do while will always fire AT LEAST ONCE
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
    }

}
