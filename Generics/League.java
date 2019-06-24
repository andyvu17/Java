package com.Andyvu;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            System.out.println("Team is already in this league");
            return false;
        }
        league.add(team);
        return true;
    }

    public void printLeagueTable(){
        System.out.println("Teams in the " + this.name + "\n"
                + "============================");

        for(T a : league) {
            System.out.println(a.getName());
        }
    }
}
