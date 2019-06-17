package com.Andyvu;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private ArrayList<Song> trackList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.trackList = new ArrayList<>();
    }

    public boolean addSong(String title, String duration) {
        //check if song exists
        if(findSong(title) == null){
            //if song doesn't exists add it to album, return true
            this.trackList.add(new Song(title, duration));
            return true;
        }
        //else return false
        return false;
    }

    private Song findSong(String title){
        //loop through trackList and check if song exists already
        for(int i = 0; i < this.trackList.size(); i++) {
            //if song is found, return song
            if(this.trackList.get(i).getTitle().equals(title)){
                return this.trackList.get(i);
            }
        }
        //else return null
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        //handle off by 1 error
        int index = trackNumber -1;
        //if valid trackNumber is passed, add song to playlist return true
        if((index >= 0) && (index <= this.trackList.size())) {
            playlist.add(this.trackList.get(index));
            return true;
        }
        //else return false
        System.out.println("Track " + index + " does not exist, failed to add");
        return false;
    }

    public boolean addToPlaylist(String trackName, LinkedList<Song> playlist) {
        Song foundSong = findSong(trackName);
        //find song, if found add to playlist return true
        if(foundSong != null){
            playlist.add(foundSong);
            return true;
        }
        //if not found return false
        System.out.println("Failed to add to playlist");
        return false;
    }
}
