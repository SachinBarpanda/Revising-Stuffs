package com.Sachin.ownPackage;

public class Fish extends Animals {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int weight, int size, int gills, int eyes, int fins) {
        super(name, "guana",1 ,1, weight, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }
    public void moveMuscles(){

    }
    public void moveBackFin(){

    }
    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        System.out.println("Fish is now moving");
        super.move(speed);
    }
}
