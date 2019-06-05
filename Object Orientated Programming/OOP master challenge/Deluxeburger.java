package com.Andyvu;

public class Deluxeburger extends Hamburger {
    public Deluxeburger() {
        super("Deluxe", "Sourdough", "Grass-Fed Beef", 9.00);
        super.addAddition1("chips", .25);
        super.addAddition2("drink", 1.00);
    }

}
