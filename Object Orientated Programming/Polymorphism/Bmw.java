package com.Andyvu;

public class Bmw extends Car {

    public Bmw() {
        super("Bmw", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("start Bmw engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate Bmw");
    }

    @Override
    public void brake() {
        System.out.println("apply brakes on Bmw");
    }
}
