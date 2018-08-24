package com.audang;

public class Room {
    private int door;
    private int window;
    private Dimensions dimensions;

    public Room(int door, int window, Dimensions dimensions) {
        this.door = door;
        this.window = window;
        this.dimensions = dimensions;
    }

    public int getDoor() {
        return door;
    }

    public int getWindow() {
        return window;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
