package com.Andyvu;

public class Hamburger {
    private double basePrice;
    private String bread;
    private String meat;
    private String name;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String bread, String meat, double basePrice) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double finalBurger() {
        double finalPrice = this.basePrice;
        System.out.println(this.name + " hamburger on " + this.bread + " bread is $" + this.basePrice);
        if(addition1Name != null) {
            finalPrice += addition1Price;
            System.out.println(this.addition1Name + " = +" + this.addition1Price);
        }
        if(addition2Name != null) {
            finalPrice += addition2Price;
            System.out.println(this.addition2Name + " = +" + this.addition2Price);
        }
        if(addition3Name != null) {
            finalPrice += addition3Price;
            System.out.println(this.addition3Name + " = +" + this.addition3Price);
        }
        if(addition4Name != null) {
            finalPrice += addition4Price;
            System.out.println(this.addition4Name + " = +" + this.addition4Price);
        }
        return finalPrice;
    }
}
