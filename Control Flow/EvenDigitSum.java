package com.Andyvu;

//        Write a method named getEvenDigitSum with one parameter of type int called number.
//
//        The method should return the sum of the even digits within the number.
//
//        If the number is negative, the method should return -1 to indicate an invalid value.
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//
//        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//
//        * getEvenDigitSum(-22); → should return -1 since the number is negative

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(2));
    }

    public static int getEvenDigitSum (int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            int lastDigit = number % 10;    //extract last digit
            if((lastDigit % 2) == 0) {      //check if digit is even
                sum += lastDigit;           //add to sum if number is even
            }
            number/=10;                     //remove the last number
        }
        return sum;                         //return sum
    }
}
