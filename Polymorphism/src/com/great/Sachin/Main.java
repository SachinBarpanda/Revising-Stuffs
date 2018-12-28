package com.great.Sachin;

class Movie{
 private String name;

 public Movie(String name){
     this.name= name;
    }

    public String plot(){
     return "No plot found";
    }
}
class Jaws extends Movie{
    public Jaws(String name){
        super ("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eating lots of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(String name){
        super (" Independence Day");
    }

    public String plot(){
        return " Alien attacking people";
    }
}
class MazerRunner extends Movie{

    public MazerRunner(String name){
        super (" Maze Runner");
    }

    public String plot(){
        return " Kids Running around Maze";
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
