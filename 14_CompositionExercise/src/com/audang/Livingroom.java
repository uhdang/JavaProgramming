package com.audang;

public class Livingroom extends Room {
    private Couch couch;
    private Table table;
    private TV tv;

    public Livingroom(int door, int window, Dimensions dimensions, Couch couch, Table table, TV tv) {
        super(door, window, dimensions);
        this.couch = couch;
        this.table = table;
        this.tv = tv;
    }

    public void turnOnTV() {
        System.out.println("Turning on tv from Livingroom");
        tv.turnOn();
    }

    public void turnOffTV() {
        System.out.println("Turning off tv from Livingroom");
        tv.turnOff();
    }

    public Couch getCouch() {
        return couch;
    }

    public Table getTable() {
        return table;
    }

    public TV getTv() {
        return tv;
    }
}
