package com.audang;

public class Main {
    /*
        // Changing number of parameters overload methods
        public static void main(String[] args) {
            int newScore = calculateScore("Tim", 500);
            System.out.println("New score is " + newScore);
            calculateScore(75);
            calculateScore();
        }

        public static int calculateScore(String playerName, int score) {
            System.out.println("Player " + playerName + " scored " + score + " points");
            return score * 1000;
        }

        public static int calculateScore(int score) {
            System.out.println("Unnamed player scored " + score + " points");
            return 0;
        }

        public static int calculateScore() {
            System.out.println("No player name, no player score");
            return 0;
        }
    */

    // Challenge
    public static void main(String[] args) {

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 && inches > 12)) {
            return -1;
        }

        double toInch = feet * 12 + inches;
        double centimeters = toInch * 2.54;
        System.out.println("Total centimeters: " + centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }

        int howManyFeet = inches / 12;
        int leftOverInch = inches % 12;

        System.out.println("Number of Feet from given inches: " + howManyFeet);
        calcFeetAndInchesToCentimeters(howManyFeet, leftOverInch);
        return howManyFeet;
    }
}
