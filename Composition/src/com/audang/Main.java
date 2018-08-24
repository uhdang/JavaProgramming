package com.audang;

public class Main {
    // "Class" is a "is a" relationship while
    // "Composition" is a "has a" relationship.
    // i.e. Car "is a" Vehicle, and Computer "has a" motherboard

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();


    }
}
