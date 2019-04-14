package com.Andyvu;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(255));
        System.out.println(sumFirstAndLastDigit(7));
        System.out.println(sumFirstAndLastDigit(-7));
    }
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int firstDigit = number;
        int lastDigit = number % 10;


        while(number >= 10) {
           firstDigit = number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
