package com.Andyvu;

import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");

        bank.addBranch("Hayward");

        bank.addCustomer("Hayward","Andy", 50.00);
        bank.addCustomer("Hayward","Zhynah", 10.30);
        bank.addCustomer("Hayward","Randy", 20.25);

        bank.addBranch("San Jose");
        bank.addCustomer("San Jose", "Hulk", 100.00);

        bank.addTransaction("Hayward", "Andy", 100.00);
        bank.addTransaction("Hayward", "Andy", 200.00);
        bank.addTransaction("Hayward", "Zhynah", 1000.00);
        bank.addTransaction("San Jose", "Hulk", 50.00);

        bank.addCustomer("San Jose", "Iron Man", 10000.00);
        if(bank.addCustomer("Knowhere", "Thanos", 1000.00)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failed, invalid location");
        }


        bank.listCustomers("Hayward", true);
        bank.listCustomers("San Jose", false);
        bank.listCustomers("San Jose", true);
    }
}
