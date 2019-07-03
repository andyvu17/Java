package com.Andyvu;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>(exits); //passes a copy of the hashmap, not the original
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    String getDescription() {
        return description;
    }

    Map<String, Integer> getExits() {
        return new HashMap<>(exits); //passes a copy of the hashmap, not the original
    }
}
