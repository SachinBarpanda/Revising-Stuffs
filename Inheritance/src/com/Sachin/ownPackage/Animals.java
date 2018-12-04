package com.Sachin.ownPackage;

public class Animals {
    private String name;
    private String type;
    private int brain ;
    private int body ;
    private int weight;
    private int size ;

    public Animals(String name, String type, int brain, int body, int weight, int size) {
        this.name = name;
        this.type = type;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;
    }

    public void move(int speed){
        System.out.println("Animal move at "+ speed);
    }
    public void eat(){
        System.out.println("Animals do eat right!");
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }
}
