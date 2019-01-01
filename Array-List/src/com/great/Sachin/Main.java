package com.great.Sachin;

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
                    System.out.println("Enter the item and position to be modified");
                    String modify = sc.nextLine();
                    int x= sc.nextInt();
                    sc.nextLine();
                    groceryList.modifyGroceryList(x-1,modify);
                    break;

                case 4:
                    System.out.println("Enter the positon of the item to be removed");
                    int remove = sc.nextInt();
                    sc.nextLine();
                    groceryList.removeGroceryIte(remove-1);
                    break;

                case 5:
                    System.out.println("Enter the item you want to find");
                    String find = sc.nextLine();
                    if(groceryList.findItem(find)!=null) {
                        System.out.println("Item found " + groceryList.findItem(find));
                    }else {
                        System.out.println("Nothing is found");
                    }
                    break;

                case 6:
                    System.out.println("You are exiting the Application");
                    run=true;
                    break;

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
