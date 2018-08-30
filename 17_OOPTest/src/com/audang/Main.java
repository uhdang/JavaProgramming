package com.audang;

public class Main {

    public static void main(String[] args) {
        // Our application will help Bill to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.

        // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that

        // Each one of these items gets charged an additional price so you need some way to track how many items got added
        // and to calculate the final price (base burger with all the additions).

        // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
        // Create a Burger class to deal with all the above.
        // The constructor should only include the roll type, meat and price, can also include name of burger or you
        // can use a setter.

        // Also create two extra varieties of Hamburgers (subclasses) to cater for
        // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
        // The healthy burger can have 6 items (Additions) in total.
        // hint:  you probably want to process the two additional items in this new class (subclass of Burger),
        // not the base class (Burger), since the two additions are only appropriate for this new class
        // (in other words new burger type).

        // b) Deluxe hamburger - comes with chips and drinks as additions, but
        // no extra additions are allowed.
        // hint:  You have to find a way to automatically add these new additions
        // at the time the deluxe burger
        // object is created, and then prevent other additions being made.

        //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
        // burger (base price + all additions)
        // For the two additional classes this may require you to be looking at the base class for pricing and then
        // adding totals to final price.

        Addition lettuce = new Addition(1, "Lettuce");
        Addition tomato = new Addition(1, "Tomato");
        Addition carrot = new Addition(1, "Carrot");
        Addition mushroom = new Addition(1, "Mushroom");
        Addition onion = new Addition(1, "Onion");
        Addition bacon = new Addition(2, "Bacon");
        Addition cheese = new Addition(1, "Cheese");



        Burger baseBurger = new Burger("BaseBurger", 10.00, "regular", "beef");
        baseBurger.addAddition(lettuce);
        baseBurger.addAddition(tomato);
        baseBurger.addAddition(carrot);
        baseBurger.addAddition(mushroom);
        baseBurger.addAddition(onion);
        System.out.println(baseBurger.getPrice());

        System.out.println("---------------------");

        HealthyBurger healthyBurger = new HealthyBurger(15.00, "organic beef");
        healthyBurger.addAddition(lettuce);
        healthyBurger.addAddition(tomato);
        healthyBurger.addAddition(carrot);
        healthyBurger.addAddition(mushroom);
        healthyBurger.addAddition(onion);
        healthyBurger.addAddition(bacon);
        healthyBurger.addAddition(cheese);
        System.out.println(healthyBurger.getPrice());

        System.out.println("---------------------");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger(14, "whole wheet", "double beef");
        deluxeHamburger.addAddition(tomato);
        System.out.println(deluxeHamburger.getPrice());

    }
}
