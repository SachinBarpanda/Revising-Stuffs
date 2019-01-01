package com.great.Sachin;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String Item){
//        System.out.println("Your item is being added , item is : "+ Item);
        groceryList.add(Item);

    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + "items in your grocery List");
        for(int i = 0;i<groceryList.size(); i++){
            System.out.println((i+1)+ "." + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+ (position+1) +
                " has been modified");
        System.out.println("New Item is : " + newItem + " At position :" + position);
    }

    public void removeGroceryIte(int position){
        String theItem = groceryList.get(position);
        System.out.println("Item at position "+ position + "is being removed");
        groceryList.remove(position);

    }

    public String findItem(String searchItem){
        int position =groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
