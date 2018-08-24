package com.audang;

public class Closet {
    private Dimensions dimensions;
    private String manufacturer;

    public Closet(Dimensions dimensions, String manufacturer) {
        this.dimensions = dimensions;
        this.manufacturer = manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
