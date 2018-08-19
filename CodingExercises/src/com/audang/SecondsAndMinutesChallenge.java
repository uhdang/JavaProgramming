package com.audang;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-4));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hour = minutes / 60;
        int min = minutes % 60;
        return hour + "h " + min + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int min = seconds / 60;
        int sec = seconds % 60;
        return getDurationString(min, sec);
    }
}
