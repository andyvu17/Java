package com.Andyvu;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tie = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " already exists on the team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked by the " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            this.won++;
        } else if(ourScore == theirScore) {
            this.tie++;
        } else {
            this.lost++;
        }
        this.played++;
        //update opponents score
        if(opponent != null) {
            matchResults(null, theirScore, ourScore);
        }
    }

}
