package com.Andyvu;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> americanLeague = new League<>("American League");
        League<Team<BaseballPlayer>> nationalLeague = new League<>("National League");
        Team<FootballPlayer> niners = new Team<>("49ers");
        Team<FootballPlayer> raiders = new Team<>("Raiders");
        Team<BaseballPlayer> giants = new Team<>("Giants");

        FootballPlayer joe = new FootballPlayer("joe");
        FootballPlayer steve = new FootballPlayer("steve");
        FootballPlayer colin = new FootballPlayer("colin");
        FootballPlayer marshawn = new FootballPlayer("marshawn");

        BaseballPlayer buster = new BaseballPlayer("buster");
        BaseballPlayer pablo = new BaseballPlayer("pablo");
        BaseballPlayer madison = new BaseballPlayer("madison");

        niners.addPlayer(joe);
        //generics prevents baseball player from being added to football team
//        niners.addPlayer(buster);
        niners.addPlayer(steve);
        niners.addPlayer(colin);

        raiders.addPlayer(marshawn);

        giants.addPlayer(buster);
        giants.addPlayer(pablo);
        giants.addPlayer(madison);

        americanLeague.add(niners);
        americanLeague.add(raiders);

        americanLeague.printLeagueTable();

        nationalLeague.add(giants);

        nationalLeague.printLeagueTable();

    }

}
