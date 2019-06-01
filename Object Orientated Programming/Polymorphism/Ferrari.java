package com.Andyvu;

public class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("start Ferrari engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate Ferrari");
    }

    @Override
    public void brake() {
        System.out.println("apply brakes on Ferrari");
    }
}
