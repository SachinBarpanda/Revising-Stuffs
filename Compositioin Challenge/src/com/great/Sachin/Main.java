package com.great.Sachin;

public class Main {
    public static void main(String [] args){
        House myHome = new House("Blue",5,2);
        //Laptop laptop=new Laptop(2,4,1,"LI-ion");
        Laptop laptop1=new Laptop(4,4,1,"Li-ion");
        Room myroom=new Room("hp",laptop1,"G-one",4,4,3,1);
        myroom.getLeno().watchMovie();
        //Laptop laptop1=new Laptop(4,4,1,"Li-ion");
        //laptop1.watchMovie();

    }
}
