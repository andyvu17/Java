package com.Andyvu;

import java.util.Scanner;

public class ArraySort {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values to sort");
        int [] array = new int[capacity];

        for(int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public static int [] sortArray(int [] array) {
        for(int i = 0; i < array.length; i++){
            for(int y = array.length - 1; y > i; y--) {
                if(array[i] < array[y]) {
                    int temp = array[i];
                    array[i] = array[y];
                    array[y] = temp;
                }
            }
        }
        return  array;
    }

    //TEST
    public static void main(String[] args) {
        int [] myArray = getIntegers(5);
        printArray(myArray);
        int [] sortedArray = sortArray(myArray);
        printArray(sortedArray);
    }
}
