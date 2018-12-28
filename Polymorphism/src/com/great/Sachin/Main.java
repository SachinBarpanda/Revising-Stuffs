package com.great.Sachin;

class Movie{
 private String name;
 public Movie(String name){
     this.name= name;
    }
    public String getName(){
        return name;
    }
    public String plot(){
     return "No plot found";
    }
}


class Jaws extends Movie{
    public Jaws(){
        super ("Jaws");
    }
    @Override
    public String plot() {
        return "Shark eating lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super (" Independence Day");
    }
    public String plot(){
        return " Alien attacking people";
    }
}
class MazerRunner extends Movie{
    public MazerRunner(){
        super (" Maze Runner");
    }
    public String plot(){
        return " Kids Running around Maze";
    }
}

class StarWars extends Movie{

    public StarWars(){
        super (" Star Wars");
    }
    public String plot(){
        return "Imperial forces taking over the universe";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie(){
        super (" Forgettable Movie");
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Movie movie = randomSwitch();
            System.out.println("Movie randomly selected is : "+movie.getName() + "\n"
                    +"Plot is : " + movie.plot() +"\n");
        }
    }
    public static Movie randomSwitch(){
        int movieNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random Number generated : " + movieNumber);
        switch (movieNumber){

            case 1 : return new Jaws();
            case 2 : return new IndependenceDay();
            case 3 : return new MazerRunner();
            case 4 : return new StarWars();
            case 5 : return new ForgettableMovie();
        }
        return null;
    }
}
