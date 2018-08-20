package com.audang;

public class Ex08_MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int forYear = 60 * 24 * 365;
            long year = minutes / forYear;
            long day = (minutes % forYear) / (60 * 24);
            System.out.println(minutes + " min = " + year + " y and " + day + " d");

        }
    }
}
