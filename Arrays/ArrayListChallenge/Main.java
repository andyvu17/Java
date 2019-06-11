package com.Andyvu;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("408-952-8547");

    public static void main(String[] args) {
        boolean quit = false;
        showActions();
        while(!quit) {
            System.out.println("Enter action: (Enter 6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilephone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    showActions();
                    break;
                default:
                    showActions();
            }
        }
    }

    private static void addContact() {
        System.out.println("Enter name of contact:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number of contact:");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        mobilephone.addNewContact(newContact);
    }

    private static void updateContact() {
        System.out.println("Enter contact name to update:");
        String name = scanner.nextLine();
        Contact existingContact = mobilephone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        mobilephone.updateContact(existingContact, newContact);
    }

    public static void queryContact() {
        System.out.println("Enter name to query:");
        String name = scanner.nextLine();
        Contact queryContact = mobilephone.queryContact(name);
        if(queryContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Found:\n"
                + queryContact.getName() + " - " + queryContact.getPhoneNumber());
    }

    public static void removeContact() {
        System.out.println("Enter contact name to remove:");
        String name = scanner.nextLine();
        Contact removeContact = mobilephone.queryContact(name);
        if(removeContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        mobilephone.removeContact(removeContact);
    }

    private static void showActions() {
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown\n" +
                "1 - to print all contacts\n" +
                "2 - to add new contact\n" +
                "3 - to update existing contact\n" +
                "4 - to query existing contact\n" +
                "5 - to remove existing contact\n" +
                "6 - to print all available options."
        );
    }


}
