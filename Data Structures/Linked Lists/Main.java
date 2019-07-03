package com.Andyvu;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album myAlbum = new Album("damn");
        myAlbum.addSong("blood", "1:58");
        myAlbum.addSong("dna", "3:05");
        myAlbum.addSong("yah", "2:40");
        myAlbum.addSong("element", "3:28");
        myAlbum.addSong("feel", "3:34");
        myAlbum.addSong("loyalty", "3:47");
        albums.add(myAlbum);

        Album myAlbum2 = new Album("marshall mathers lp");
        myAlbum2.addSong("public service announcement 2000", "0:25");
        myAlbum2.addSong("kill you", "4:24");
        myAlbum2.addSong("stan", "6:44");
        myAlbum2.addSong("who knew", "3:47");
        myAlbum2.addSong("the way i am", "4:50");
        myAlbum2.addSong("the real slim shady", "4:44");
        albums.add(myAlbum2);

        LinkedList<Song> andysPlaylist = new LinkedList<>();
        albums.get(0).addToPlaylist("dna", andysPlaylist);
        albums.get(0).addToPlaylist("yah", andysPlaylist);
        albums.get(0).addToPlaylist("element", andysPlaylist);
        albums.get(1).addToPlaylist(3, andysPlaylist);
        albums.get(1).addToPlaylist(5, andysPlaylist);
        albums.get(1).addToPlaylist(2, andysPlaylist);
        albums.get(1).addToPlaylist(10, andysPlaylist);

        play(andysPlaylist);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("There are no songs in the playlist");
        } else {
            System.out.println("Now playing...\n" + listIterator.next().toString());
            printOptions();
        }
        //display options
        while(!quit) {
            int selection = scan.nextInt();
            scan.nextLine();

            switch(selection) {
                case 0:
                    System.out.println("Exit playlist");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Playing " + listIterator.next().toString());
                    } else {
                        System.out.println("At the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("At the beginning of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            System.out.println("Playing " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("At the beginning of playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Playing " + listIterator.next());
                            forward = true;
                        } else {
                            System.out.println("At the end of playlist");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    printOptions();
                    break;
            }
        }
    }

    private static void printOptions() {
        System.out.println("Select from options below:\n"
                        + "0 - quit\n"
                        + "1 - play next song\n"
                        + "2 - play previous song\n"
                        + "3 - replay current song\n"
                        + "4 - print playlist\n"
                        + "5 - print options");
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> iterator= playlist.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
