package com.audang;

public class Main {

    public static void main(String[] args) {
        TV livingroomTV = new TV("Samsung", new Dimensions(5, 5, 5), true);
        Table livingroomTable = new Table("Red", "Fur", new Dimensions(10, 10, 10));
        Couch livingroomCouch = new Couch(3, "black");
        Livingroom myLivingroom = new Livingroom(1, 2, new Dimensions(10, 20, 30), livingroomCouch, livingroomTable, livingroomTV);

        Bed myBed = new Bed("King");
        Closet myCloset = new Closet(new Dimensions(4, 5, 6), "IKEA");
        Bedroom myBedroom = new Bedroom(1, 3, new Dimensions(20, 30, 40), myBed, myCloset);

        Bathroom myBathroom = new Bathroom(1, 1, new Dimensions(7, 7, 10), true, true);

        Address myAddress = new Address(32, "MyStreet", "LC123D", "Berlin", "Germany");
        House myHouse = new House(myLivingroom, myBedroom, myBathroom, new Dimensions(50, 50, 10), myAddress, "apartment", 5);

        myHouse.getLivingroom().getTv().turnOn();

        myHouse.getLivingroom().turnOnTV();

    }
}
