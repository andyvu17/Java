package com.Andyvu;

import java.util.ArrayList;

public class Branch {
    private String branchLocation;
    private ArrayList<Customer> customers;

    public Branch(String branchLocation) {
        this.branchLocation = branchLocation;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String name, double amount) {
        if(findCustomer(name) == null) {
            Customer newCustomer = new Customer(name, amount);
            this.customers.add(newCustomer);
            return true;
        }
        return false;
    }

    public boolean addTransaction(String name, double amount) {
        Customer foundCustomer = findCustomer(name);
        if(foundCustomer != null) {
            foundCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        //loop through customer list and check for matching names
        for(int i =0; i < this.customers.size(); i++){
            Customer foundCustomer = this.customers.get(i);
            if(foundCustomer.getName().equals(name)){
                //if found return found
                return foundCustomer;
            }
        }
        //else return null
        return null;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
