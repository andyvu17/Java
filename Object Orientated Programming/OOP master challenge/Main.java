package com.Andyvu;


public class Main {
    public static void main(String[] args) {
        Hamburger burger = new Hamburger("andy", "wheat", "medium-well", 4.25);
        burger.addAddition1("Lettuce", 0.15);
        burger.addAddition2("Tomato", 0.20);
        burger.addAddition3("Onion", 0.10);
        System.out.println("Final total is: $" + burger.finalBurger());

        Healthyburger healthyburger = new Healthyburger("veggie", 5.00);
        healthyburger.addHealthyAddition1("lentils", .50);
        healthyburger.addAddition1("lettuce", .10);
        healthyburger.addHealthyAddition2("tofu", 1.00);
        System.out.println("Final total is: $" + healthyburger.finalBurger());

        Deluxeburger deluxeburger = new Deluxeburger();
        System.out.println("Final total is: $" + deluxeburger.finalBurger());
    }
}
