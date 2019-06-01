package com.Andyvu;

public class Mercedes extends Car {
    public Mercedes() {
        super("Mercedes", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("start Mercedes engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate Mercedes");
    }

    @Override
    public void brake() {
        System.out.println("apply brakes on Mercedes");
    }
}
