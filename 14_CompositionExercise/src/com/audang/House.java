package com.audang;

public class House {
    private Livingroom livingroom;
    private Bedroom bedroom;
    private Bathroom bathroom;
    private Dimensions dimensions;
    private Address address;

    private String type;
    private int age;

    public House(Livingroom livingroom, Bedroom bedroom, Bathroom bathroom, Dimensions dimensions, Address address, String type, int age) {
        this.livingroom = livingroom;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.dimensions = dimensions;
        this.address = address;
        this.type = type;
        this.age = age;
    }

    public Livingroom getLivingroom() {
        return livingroom;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Address getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
