package com.Andyvu;

public class Healthyburger extends Hamburger{
    private String healthyAddition1Name;
    private double healthyAddition1Price;
    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public Healthyburger(String meat, double basePrice) {
        super("Healthy", "Brown Rye", meat, basePrice);
    }

    public void addHealthyAddition1(String healthyAddition1Name, double healthyAddition1Price) {
        this.healthyAddition1Name = healthyAddition1Name;
        this.healthyAddition1Price = healthyAddition1Price;
    }

    public void addHealthyAddition2(String healthyAddition2Name, double healthyAddition2Price) {
        this.healthyAddition2Name = healthyAddition2Name;
        this.healthyAddition2Price = healthyAddition2Price;
    }

    @Override
    public double finalBurger() {
        double healthyBurgerPrice = super.finalBurger();

        if(healthyAddition1Name != null) {
            healthyBurgerPrice += healthyAddition1Price;
            System.out.println(this.healthyAddition1Name + " = $" + this.healthyAddition1Price);
        }
        if(healthyAddition2Name != null) {
            healthyBurgerPrice += healthyAddition2Price;
            System.out.println(this.healthyAddition2Name + " = $" + this.healthyAddition2Price);
        }
        return healthyBurgerPrice;
    }
}
