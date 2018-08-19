package com.audang;

public class Main {

    public static void main(String[] args) {

        /*
        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
        }
        */

       char value = 'A';
       switch (value) {
           case 'A':
               System.out.println("Value is A");
               break;
           case 'B':
               System.out.println("Its is B");
               break;
           case 'C':
               System.out.println("It is CCCCC");
               break;
           default:
               System.out.println("NOT A, B nor C");

       }


    }
}
