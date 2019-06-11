package com.Andyvu;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    //Read input from user assuming only integers are entered
    private static int [] readIntegers(int capacity) {
        int [] array = new int[capacity];
        for(int i = 0; i < capacity; i++) {
            System.out.println("Enter number " + (i + 1));
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        return array;
    }

    //Loop through the array and find the minimum integer
    private static int findMin(int [] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //test
    public static void main(String[] args) {
        System.out.println("Enter capacity");
        int count = scanner.nextInt();

        int [] myArray = readIntegers(count);
        System.out.println(findMin(myArray));
    }
}
