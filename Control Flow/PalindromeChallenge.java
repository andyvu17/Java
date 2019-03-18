package com.Andyvu;

//        Write a method called isPalindrome with one int parameter called number.
//
//        The method needs to return a boolean.
//
//        It should return true if the number is a palindrome number otherwise it should return false.
//
//        Check the tips below for more info about palindromes.
//
//        Example Input/Output
//
//        isPalindrome(-1221); → should return true
//
//        isPalindrome(707); → should return true
//
//        isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

public class PalindromeChallenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int firstNumber = number;

        while(number != 0) {
            //extract last digit from number
            //add to reverse variable
            reverse += number % 10;
            //compare reverse to number
            if(firstNumber == reverse) {
                return true;
            }
            //move to next place value
            reverse *= 10;

            //remove last digit number
            number /= 10;

            //loop until no numbers left to process
        }
        //return true if matching, false if not
        return false;
    }
}
