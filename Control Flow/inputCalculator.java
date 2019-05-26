package com.Andyvu;

//   Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//
//   The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//
//   When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//
//   XX represents the sum of all entered numbers of type int.
//   YY represents the calculated average of all numbers of type long.

import java.util.Scanner;

public class inputCalculator {
    public static void inputThenPrintSumAndAverage() {
      Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        //keep reading user input until invalid value is read (ex.non-zero number)
        while(true) {
            boolean isValidInt = scanner.hasNextInt();

            if(isValidInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                average = Math.round((double) sum / count);
                break;
            }
            scanner.nextLine();
        }
        //print the sum and print the average of all numbers
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
