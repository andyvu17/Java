package com.Andyvu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You have exited", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "you are in your room", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "you have entered the restroom", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "you are in the living room", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "you are in the kitchen", tempExit));


        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "you are in the garage", tempExit));


        Map<String, String> words = new HashMap<>();
        words.put("QUIT", "Q");
        words.put("NORTH", "N");
        words.put("SOUTH", "S");
        words.put("WEST", "W");
        words.put("EAST", "E");

        //read user input, and goes in the direction based on user input
        //ex, if user inputs "w", "west", "go west", you will go in the west direction
        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String [] splitWords = direction.split(" ");
                for(String i: splitWords) {
                    if(words.containsKey(i)) {
                       direction = words.get(i);
                       break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            }
            if(!locations.containsKey(loc)) {
                System.out.println("You cannot go that way");
            }
        }
    }
}
