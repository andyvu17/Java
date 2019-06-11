package com.Andyvu;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchLocation){
        if(findBranch(branchLocation) == null) {
            Branch newBranch = new Branch(branchLocation);
            this.branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchLocation, String customerName, double amount) {
        //find branch to add customer to
        Branch foundBranch = findBranch(branchLocation);
        if(foundBranch != null) {
            //add new customer to branch
            return foundBranch.addCustomer(customerName, amount);
        }
        return false;
    }

    public boolean addTransaction(String branchLocation, String customerName, double amount) {
        //find branch
        Branch foundBranch = findBranch(branchLocation);
        if(foundBranch != null) {
            //add transaction amount to customers account
            return foundBranch.addTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchLocation) {
        for(int i = 0; i < this.branches.size(); i++) {
            Branch foundBranch = this.branches.get(i);
            if (foundBranch.getBranchLocation().equals(branchLocation)) {
                return foundBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchLocation, boolean showTransactions) {
        //find branchLocation
        Branch foundBranch = findBranch(branchLocation);
        if(foundBranch != null) {
            //show customers at branchLocation
            System.out.println("Customer list for "
                    + this.bankName + " at "
                    + foundBranch.getBranchLocation()
                    + " location\n"
                    + "===========================================");

            ArrayList<Customer> branchCustomers = foundBranch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println((i+1) + ".Customer: " + customer.getName());
                //if showTransaction is true, list customers transactions
                if(showTransactions) {
                    ArrayList<Double> customerTransactions = customer.getTransactions();
                    System.out.println("Transactions\n" +
                                    "==================");
                    for(int y = 0; y < customerTransactions.size(); y++) {
                        System.out.println((y+1) + ". $" + customerTransactions.get(y));
                    }
                }
                System.out.println("");
            }
            return true;
        }
        return false;
    }
}
