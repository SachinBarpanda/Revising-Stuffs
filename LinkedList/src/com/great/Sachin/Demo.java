package com.great.Sachin;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        places.add("Delhi");
        places.add("Agra");
        places.add("Mumbai");
        places.add("Chennai");
        places.add("Kolkata");
        printPlaces(places);

        places.add(3,"Bangalore");
        printPlaces(places);

        places.remove(4);
        printPlaces(places);

    }

    public static void printPlaces(LinkedList<String>places){
        Iterator<String> i = places.iterator();
        while(i.hasNext()){
            System.out.println("We are in : "+i.next());
        }
        System.out.println("**************************");
    }

}
