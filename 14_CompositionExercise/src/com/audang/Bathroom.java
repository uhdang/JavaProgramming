package com.audang;

public class Bathroom extends Room {
    private boolean hasBathtub;
    private boolean hasToweldryer;

    public Bathroom(int door, int window, Dimensions dimensions, boolean hasBathtub, boolean hasToweldryer) {
        super(door, window, dimensions);
        this.hasBathtub = hasBathtub;
        this.hasToweldryer = hasToweldryer;
    }

    public boolean isHasBathtub() {
        return hasBathtub;
    }

    public boolean isHasToweldryer() {
        return hasToweldryer;
    }
}
