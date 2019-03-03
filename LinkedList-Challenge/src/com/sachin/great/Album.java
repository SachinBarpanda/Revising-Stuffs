package com.sachin.great;

import java.util.ArrayList;

public class Album {
    public String albumName;
    ArrayList<Songs>newSongs = new ArrayList<>();
    public Album(String albumName){
        this.albumName=albumName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    private Songs addSongs(String name,int duration){
        Songs song = new Songs(name,duration);
        return song.addSongs(name,duration);
    }
    public void addSongsInAlbum(String albumName,String name,int duration){
        if(searchAlbum(albumName)>=0) {
            Songs album = findAlbum(albumName);
                    album.addSongs(name,duration);
        }
    }
    //check this if error
    public int searchAlbum(String alName){
        for (int i = 0; i < newSongs.size(); i++) {
            Songs album = newSongs.get(i);
            if(album.equals(alName))
            return i;
        }
        return -1;
    }
    public Songs findAlbum (String name){
        for (int i = 0; i < newSongs.size(); i++) {
            Songs album = newSongs.get(i);
            if(album.getTitle().equals(name))
                return album;
        }
        return null;
    }


}
