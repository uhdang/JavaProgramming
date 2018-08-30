package com.audang;

class Car {
    private boolean engine;
    private int cylinder;
    private int wheel;
    private String name;

    public Car(int cylinder, String name) {
        this.engine = true;
        this.cylinder = cylinder;
        this.wheel = 4;
        this.name = name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheel() {
        return wheel;
    }

    public String getName() {
        return name;
    }
}

class Bently extends Car {
    public Bently(int cylinder) {
        super(cylinder, "Bently");
    }

    @Override
    public String startEngine() {
        return "Bently -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Bently -> accelerate()";
    }

    @Override
    public String brake() {
        return "Bently -> brake()";
    }
}


class Lamborgini extends Car {
    public Lamborgini(int cylinder) {
        super(cylinder, "Bently");
    }

    @Override
    public String startEngine() {
        return "Lamborgini -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Lamborgini -> accelerate()";
    }

    @Override
    public String brake() {
        return "Lamborgini -> brake()";
    }
}



public class Main {

    public static void main(String[] args) {
        Car car = new Car(2, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Bently bently = new Bently(4);
        System.out.println(bently.startEngine());
        System.out.println(bently.accelerate());
        System.out.println(bently.brake());

        Lamborgini lamborgini = new Lamborgini(6);
        System.out.println(lamborgini.startEngine());
        System.out.println(lamborgini.accelerate());
        System.out.println(lamborgini.brake());

        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameter.

        // Create appropriate getters

        // Create some methods like startEngine, accelerate, and brake

        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

    }
}
