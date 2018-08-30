package com.audang;

public class DeluxeHamburger extends Burger {
    private Addition chips;
    private Addition drinks;

    public DeluxeHamburger(double price, String breadRollType, String meat) {
        super("Deluxe Hamburger", price, breadRollType, meat);
        this.chips = new Addition(2, "Chip");
        this.drinks = new Addition(2, "Drink");
    }

    @Override
    public void addAddition(Addition addition) {
        System.out.println("No addition anymore");
    }
}
