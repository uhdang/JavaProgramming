package com.audang;

public class Main {

    public static void main(String[] args) {
//        BankAccount DBOne = new BankAccount();
//
//        DBOne.setCustomerName("Jackson");
//        DBOne.setAccountNumber(12341234);
//        DBOne.setEmail("jackson@jack.son");
//        DBOne.setPhoneNumber("123-456-7890");
//        DBOne.setBalance(1000);
//
//        DBOne.deposit(500);
//        DBOne.withdraw(1000);
//
//        System.out.println(DBOne.getCustomerName());
//        System.out.println(DBOne.getAccountNumber());
//        System.out.println(DBOne.getEmail());
//        System.out.println(DBOne.getPhoneNumber());
//        System.out.println(DBOne.getBalance());

        // ========= SOLUTION =========

//        Account Foo = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "123-123-123");
//        Account Boo = new Account();

        // ------------ VIP Customer ---------
        VipCustomer person01 = new VipCustomer();
        System.out.println(person01.getName());

        VipCustomer person02 = new VipCustomer("Bob", 2500.00);
        System.out.println(person02.getName());

        VipCustomer person03 = new VipCustomer("Tim", 1000, "mail@mail");
        System.out.println(person03.getName());

    }
}
