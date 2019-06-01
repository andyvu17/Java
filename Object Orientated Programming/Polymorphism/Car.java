package com.Andyvu;

public class Car {
    private String name;
    private int wheels;
    private boolean engine;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("start engine in car class");
    }

    public void accelerate() {
        System.out.println("accelerate in car class");
    }

    public void brake() {
        System.out.println("brake in car class");
    }
}