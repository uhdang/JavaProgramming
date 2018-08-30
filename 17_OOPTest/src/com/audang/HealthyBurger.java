package com.audang;

import java.util.ArrayList;

public class HealthyBurger extends Burger {
    public HealthyBurger(double price, String meat) {
        super("HealthyBurger", price, "brown rye bread roll", meat);

    }

    @Override
    public void addAddition(Addition addition) {
        if (this.getAddition().size() >= 6) {
            System.out.println("You already have 6 additions. Maxed out.");
        } else {
            ArrayList tempAddition = this.getAddition();
            tempAddition.add(addition);
            this.setAddition(tempAddition);

            double tempPrice = this.getPrice();
            tempPrice += addition.getPrice();
            this.setPrice(tempPrice);

            System.out.println(addition.getName() + " has been added with a price of " + addition.getPrice() + ". Total Price: " + this.getPrice());
        }
    }

}
