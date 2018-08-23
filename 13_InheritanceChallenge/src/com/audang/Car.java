package com.audang;

public class Car extends Vehicle {
    private String fuel;
    private int seat;

    public Car(String fuel, int seat) {
        super(4, 1, 0);
        this.fuel = fuel;
        this.seat = seat;
    }
}
