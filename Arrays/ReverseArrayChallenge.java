package com.Andyvu;

import java.util.Arrays;

public class ReverseArrayChallenge {

    private static void reverse(int [] array) {
        int maxLength = array.length - 1;
        int midPoint = array.length / 2;

        for(int i = 0; i < midPoint; i++) {
            int temp = array[i];
            array[i] = array[maxLength - i];
            array[maxLength - i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] myArray = {1, 4, 8, 5, 3};

        System.out.println(Arrays.toString(myArray));

        reverse(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
