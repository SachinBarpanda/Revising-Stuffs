package com.great.Sachin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc =new Scanner(System.in);

    public static void main(String[] args){
        GroceryList groceryList = new GroceryList();
        boolean run=false;
        instruction();
        while (!run){
            System.out.println("Enter your choice : ");
            int choice =sc.nextInt();
            sc.nextLine();
            switch (choice){

                case 0:instruction();
                break;

                case 1:
                    System.out.println("Enter the item to be added");
                    groceryList.addGroceryItem(sc.nextLine());
                    break;

                case 2:
                    groceryList.printGroceryList();
                    break;

                case 3:
                    System.out.println("enter the old Item to be replaced");
                    String oldItem= sc.nextLine();
                    System.out.println("Enter the item and position to be modified");
                    String modify = sc.nextLine();
                    groceryList.modifyGroceryList(modify,oldItem);
                    break;

                case 4:
                    System.out.println("Enter the positon of the item to be removed");
                    String remove = sc.nextLine();
                    groceryList.removeGroceryItem(remove);
                    break;

                case 5:
                    System.out.println("Enter the item you want to find");
                    String find = sc.nextLine();

                    if(groceryList.onFile(find)) {
                        System.out.println("Item found : " + (groceryList.onFile(find)));
                    }else {
                        System.out.println("Nothing is found");
                    }
                    break;

                case 6:
                    System.out.println("You are exiting the Application");
                    run=true;
                    break;

                case 7 :
                    System.out.println("Copying the ArrayList to other");
                    //method 1

                    ArrayList<String>myArray = new ArrayList<>();
                    myArray.addAll(groceryList.getGroceryList());
                    //method 2

                    ArrayList newArrayList = new ArrayList(groceryList.getGroceryList());

                    //method 3
                    //Actually it will be used to copy the Array
                    
                    String[] myNewArray = new String [groceryList.getGroceryList().size()];
                    myNewArray = groceryList.getGroceryList().toArray(myNewArray);


                    default:
                        System.out.println("enter a valid option");
                        break;
            }
        }
    }
    public static void instruction(){
        System.out.println("type 0 : To show instruction again \n" +
                "type 1 : To add Items\n" +
                "type 2 : To Show the list\n" +
                "type 3 : To Modify item\n" +
                "type 4 : To Remove Item\n" +
                "type 5 : To Find any Item\n" +
                "type 6 : To quit");
    }
}
