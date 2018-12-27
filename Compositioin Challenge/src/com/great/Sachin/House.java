package com.great.Sachin;

public class House {
    String mainGate;
    int rooms;
    int Hall;
    Room hallMovie;

    public House(String mainGate, int rooms, int hall) {
        this.mainGate = mainGate;
        this.rooms = rooms;
        Hall = hall;
    }
    Room letMovie(){
        return hallMovie;
    }
}
