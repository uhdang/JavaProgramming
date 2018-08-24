package com.audang;

public class TV {
    private String manufacturer;
    private Dimensions dimensions;
    private Boolean isCable;
    private Boolean isPowerOn;

    public TV(String manufacturer, Dimensions dimensions, Boolean isCable) {
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.isCable = isCable;
        this.isPowerOn = false;
    }

    public void turnOn() {
        this.isPowerOn = true;
        System.out.println("TV.turnOn() - " + isPowerOn);
    }

    public void turnOff() {
        this.isPowerOn = false;
        System.out.println("TV.turnOff() - " + isPowerOn);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Boolean getCable() {
        return isCable;
    }
}
