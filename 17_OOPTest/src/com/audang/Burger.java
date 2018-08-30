package com.audang;

import java.util.ArrayList;

public class Burger {
    private String name;
    private double price;
    private String breadRollType;
    private String meat;
    private ArrayList addition;

    public Burger(String name, double price, String breadRollType, String meat) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.addition = new ArrayList(4);
    }

    public void addAddition(Addition addition) {
        if (this.addition.size() >= 4) {
            System.out.println("You already have 4 additions. No more.");
        } else {
            this.addition.add(addition);
            this.price += addition.getPrice();
            System.out.println(addition.getName() + " with price of " + addition.getPrice() + "has been added. - Total: " + this.price);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public ArrayList getAddition() {
        return addition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setAddition(ArrayList addition) {
        this.addition = addition;
    }
}
