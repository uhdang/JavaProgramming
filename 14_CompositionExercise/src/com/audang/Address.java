package com.audang;

public class Address {
    private int houseNumber;
    private String streetName;
    private String zip;
    private String city;
    private String country;

    public Address(int houseNumber, String streetName, String zip, String city, String country) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
