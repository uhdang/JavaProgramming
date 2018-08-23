package com.audang;

public class Tesla extends Car {
    private String companyName;
    private String companyCEO;

    public Tesla(int seat, String companyName, String companyCEO) {
        super("electricity", seat);
        this.companyName = companyName;
        this.companyCEO = companyCEO;
    }

}