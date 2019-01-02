package com.great.Sachin;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String Item){
//        System.out.println("Your item is being added , item is : "+ Item);
        groceryList.add(Item);

    }

    public ArrayList<String>getGroceryList(){
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + "items in your grocery List");
        for(int i = 0;i<groceryList.size(); i++){
            System.out.println((i+1)+ "." + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String newItem,String oldItem){
        if(findItem(oldItem)>=0){
            modifyGroceryList(findItem(oldItem),newItem);
        }
    }

    private void modifyGroceryList(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item at position : "+ (position+1) +
                " has been modified");
        System.out.println("New Item is : " + newItem + " At position :" + position);
    }

    public void removeGroceryItem(String item){
        if(findItem(item)>=0){
            removeGroceryItem(findItem(item));
        }
    }

    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        System.out.println("Item "+theItem+" at position "+ position + "is being removed");
        groceryList.remove(position);

    }

    private int findItem(String searchItem){
        return  groceryList.indexOf(searchItem);

    }

    public boolean onFile(String searchItem){
        if(findItem(searchItem)>=0){
            return true;
        }
        return false;
    }
}
