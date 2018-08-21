package com.audang;

public class Ex10_PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true && (temperature <= 45 && temperature >= 25)) {
            return true;
        } else if (summer != true && (temperature <= 35 && temperature >= 25)) {
            return true;
        } else {
            return false;
        }
    }
}
