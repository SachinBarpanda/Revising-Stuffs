package com.Sachin.ownPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        addInOrder(places,"Delhi");
        addInOrder(places,"Agra");
        addInOrder(places,"Mumbai");
        addInOrder(places,"Goa");
        addInOrder(places,"Chennai");
        addInOrder(places,"Kolkata");

//      print(places);
        visit(places);
    }
    public static void print(LinkedList<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("This places is : "+ iterator.next());
            //System.out.println("+++++++++++++++++++++++++++++++++++");
        }

    }
    public static boolean addInOrder(LinkedList<String>places,String newPlace){
        ListIterator<String> stringListIterator = places.listIterator();

        while(stringListIterator.hasNext()){
            int compare = stringListIterator.next().compareTo(newPlace);
            if(compare==0){
                System.out.println(compare+"is already in the list");
                return false;
            }
            else if(compare>0){
                stringListIterator.previous();
                stringListIterator.add(newPlace);
               // System.out.println(newPlace + " Is added to the list");
                return true;
            }
            else if(compare<0){

            }

        }
        stringListIterator.add(newPlace);
        return true;

    }
    public static void visit(LinkedList cities){
        Scanner sc = new Scanner(System.in);
        boolean quit =false;
        boolean goingForward = true;
        ListIterator<String>listName = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the Iterator");
            return;
        }
        else{
            System.out.println("Now visiting "+ listName.next());
            printMenu();
        }
        while(!quit){
            System.out.println("Enter your choice : ");
            int number = sc.nextInt();
            sc.nextLine();
            switch (number){
                case 0:
                    System.out.println("Vacations are over ! Good Day.");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listName.hasNext()){
                            listName.next();
                        }
                       goingForward=true;
                    }
                    if(listName.hasNext()){
                        System.out.println("Now visiting : "+listName.next());
                    }else {
                        System.out.println("Reached to the end of the list.");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listName.hasPrevious()){
                            listName.previous();
                        }
                        goingForward=false;
                    }
                    if(listName.hasPrevious()){
                        System.out.println("Now visiting : "+listName.previous());
                    }else{
                        System.out.println("We are at the start of the list.");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }
    public static void printMenu(){
        System.out.println("Available Actions : \n" +"choices : "+
                "0 : Enter to exit . \n" +
                "1 : Go to the next place \n" +
                "2 : Go to the previous place \n" +
                "3 : print available choices");
    }
}
