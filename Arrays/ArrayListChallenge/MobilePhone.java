package com.Andyvu;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        System.out.println(contact.getName() + " added to contacts");
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        //find oldContact to be changed, if not found display message
        int position = findContact(oldContact);
        if(position < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact already exists, update failed.");
            return false;
        }
        //if found update with newContact
        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        //find contact to remove, if not found display message
        if(findContact(contact) < 0) {
            System.out.println("Contact was not found.");
            return false;
        }
        //if found, remove contact from arraylist
        System.out.println(contact.getName() + " has been removed");
        this.myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position < 0) {
            return null;
        }
        return this.myContacts.get(position);
    }

    public void printContacts() {
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println(this.myContacts.get(i).getName()
                                + "\t"
                                + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
