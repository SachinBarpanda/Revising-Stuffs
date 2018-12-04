package com.Sachin.ownPackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animals animal = new Animals("Animal","fish",1,1,1,14);
        Dog dog= new Dog("tony","Pomerian",45,67,"furry",2,4,1,30);
        dog.eat();
        dog.move(50);
        Fish fish =new Fish("Ghana",20,2,4,2,6);
        fish.swim(30);

    }
}
