package com.Andyvu;

import java.util.*;

// Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced
// back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words
// from it and use them to create an untraceable replica of his ransom note.
// The words in his note are case-sensitive and he must use only whole words available in the magazine.
// He cannot use substrings or concatenation to create the words he needs.
// Given the words in the magazine and the words in the ransom note,
// print Yes if he can replicate his ransom note exactly using whole words from the magazine;
// otherwise, print No.

public class RansomNote {
    public static void match(String [] note, String [] magazine) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String s: magazine) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for(String s: note) {
            if(!map.containsKey(s)) {
                System.out.println("No");
                return;
            } else {
                map.put(s, map.get(s) - 1);
            }

            if(map.get(s) == 0) {
                map.remove(s);
            }
        }
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        String [] note = {"hi", "my", "name"};
        String [] magazine = {"hi", "my", "name", "hi"};
        match(note, magazine);

        String [] note2 = {"hi", "my", "name", "HI"};
        String [] magazine2 = {"hi", "my", "name", "hi"};
        match(note2, magazine2);

        String [] note3 = {"hi", "my", "name", "hi"};
        String [] magazine3 = {"hi", "my", "name", "hi"};
        match(note3, magazine3);
    }
}
