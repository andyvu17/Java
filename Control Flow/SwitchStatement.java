package com.Andyvu;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //Read User Input
        System.out.println("Enter Number Between 0 - 6:");

        int day = sc.nextInt();                     //Save number input in variable
        printDayOfTheWeek(day);                     //Pass value to method
    }

    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.println("Invalid Day");
        }
    }
}
