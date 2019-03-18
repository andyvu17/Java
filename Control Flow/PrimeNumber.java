package com.Andyvu;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 10; i < 50; i++) {
            if(isPrime(i) && count != 3) {
                System.out.println(i + " is a prime number");
                count++;
            }
        }
    }

    // prime number checker method
    public static boolean isPrime(int n) {
        //2 is an even prime number
        if(n == 2) {
            return true;
        }

        //1 and even numbers are not prime numbers
        if((n == 1) || (n % 2) == 0){
            return false;
        }
        //loop through numbers to check if it can be divided by anything other than 1 and itself(check if number is prime)
        for(int i = 3; i < Math.sqrt(n); i+=2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
