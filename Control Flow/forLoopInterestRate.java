package com.Andyvu;

public class forLoopInterestRate {
    static double rate = 2.0;

    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            System.out.println("$10,000 at " + rate + "% interest rate = $" + String.format("%.2f",calculateInterest(10000, rate)));
            rate++;
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return amount * (rate/100);
    }

}
