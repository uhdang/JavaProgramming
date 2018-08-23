package com.audang;

public class Vehicle {
    private int wheel;
    private int gear;
    private int engine;
    private int speed;

    public Vehicle(int wheel, int engine, int gear) {
        this.wheel = wheel;
        this.engine = engine;
        this.gear = gear;
        this.speed = 0;
    }


    public void move(int speed) {
        setSpeed(speed);
        System.out.println("Vehicle.move() - " + speed);
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed) {
        System.out.println("Vehicle.setSpeed() - " + speed);
        this.speed = speed;
    }




}
