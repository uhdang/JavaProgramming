package com.audang;

public class Bedroom extends Room {
    private Bed bed;
    private Closet closet;

    public Bedroom(int door, int window, Dimensions dimensions, Bed bed, Closet closet) {
        super(door, window, dimensions);
        this.bed = bed;
        this.closet = closet;
    }

    public Bed getBed() {
        return bed;
    }

    public Closet getCloset() {
        return closet;
    }
}
