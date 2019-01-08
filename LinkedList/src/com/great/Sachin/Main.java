package com.great.Sachin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> myInt = new ArrayList<>();

        myInt.add(1);
        myInt.add(2);
        myInt.add(3);
        myInt.add(5);

        for(int i=0;i<myInt.size();i++){
            System.out.println("Number "+i+" is "+ myInt.get(i));
        }

        myInt.add(3,4);

        for(int i=0;i<myInt.size();i++){
            System.out.println("Number "+i+" is "+ myInt.get(i));
        }
    }
}
