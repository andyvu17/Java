package com.Andyvu;

import java.util.*;

//Determine if a string has all unique characters,
// return true if it does have all unique characters, false otherwise
//String can contain ASCII characters only, no spaces

public class UniqueString {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean answer = isUnique(s);

        if(answer) {
            System.out.println(s + " is a unique string");
        } else {
            System.out.println(s + " is not a unique string");
        }
    }

    public static boolean isUnique(String s) {
        boolean [] charList = new boolean[127]; //127 ASCII characters
        for(int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if(charList[val]) {
                return false;
            }
            charList[val] = true;
        }
        return true;
    }
}
