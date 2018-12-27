package com.Sachin.ownPackage;

public class Dog extends Animals{

    private String coat;
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;

    public Dog(String name, String type, int weight, int size,String coat,int eyes,int legs,int tail,int teeth) {
        super(name, type,1,1, weight, size);
        this.coat=coat;
        this.eyes=eyes;

        this.tail=tail;
        this.teeth=teeth;
        this.legs=legs;
    }
    public  void chew(){
        System.out.println("Dogs can chew ");
    }

    public void eat(){
        System.out.println("Dogs do eat food too");
        super.eat();
        chew();
    }
    public void walk(){
        System.out.println("Dog.walk is called");
        super.move(40);

    }
    public void run(){
        System.out.println("run is called");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("move.legs is called");
    }
    public void move(int speed){
        System.out.printf("Dog.move() is overridden");
        moveLegs(60);
        super.move(30);
    }

}
