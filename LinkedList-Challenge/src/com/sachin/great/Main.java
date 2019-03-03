package com.sachin.great;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
    public static ArrayList<Album>albumArrayList = new ArrayList<>();
    public static void main(String[] args) {

        Album album = new Album("Razer");
        albumArrayList.add(album);
        album.addSongsInAlbum("Razer","Shape of you",5);
        album.addSongsInAlbum("Razer","Kiss me",6);
        album.addSongsInAlbum("Razer","Roar",4);
        Album album1 = new Album("Illuminate");
        album.addSongsInAlbum("Illuminate","Holding me back",6);
        album.addSongsInAlbum("Illuminate","Treat you better",4);
        albumArrayList.add(album1);
        LinkedList<String>playlist = new LinkedList<>();

        addSongs(playlist,"Illuminate","Treat you better");

    }
    public static void play(LinkedList<String> playlist,Songs song,String albumSearch){
        Album album = new Album("No one cares");
        if(album.findAlbum(albumSearch)!=null){
            System.out.println("Album :"+albumSearch +" is added !");
            if()
        }
        else System.out.println("No "+albumSearch+" album found!");
        Iterator<String> iterator = playlist.iterator();
        while(iterator.hasNext()){
            System.out.println("Playing : "+iterator.next());
        }
    }

    public static boolean addSongs(LinkedList<String>listPlay ,Album albums,Songs newSongs) {
        if (albumArrayList.contains(albums)) {
            ListIterator<String> stringListIterator = listPlay.listIterator();
            while (stringListIterator.hasNext()) {
                int check = stringListIterator.next().compareTo(newSongs.getTitle());
                if (check == 0) {
                    System.out.println(newSongs + " already in the list");
                    return false;
                }
            }
            if(albums.findAlbum(newSongs.getTitle())!=null){
                System.out.println(albums.findAlbum(newSongs.getTitle()) + " added! with duration "
                + newSongs.getDuration() + "min");
                stringListIterator.add(newSongs.getTitle());
                return true;
            }
            return false;

        }return false;
    }

}
