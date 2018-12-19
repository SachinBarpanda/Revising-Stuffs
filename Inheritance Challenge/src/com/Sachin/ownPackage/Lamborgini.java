package com.Sachin.ownPackage;

public class Lamborgini extends Car{
    public String musicSystem;
    public String Cushion;
    public String fridge;
    public int AC;

    public Lamborgini(int wheels, int doors, int headLight, String name, String steering,
                      int gears,int seats,int speed, String musicSystem, String cushion,
                      String fridge, int AC) {
        super(wheels, doors, headLight, name,speed, steering, gears, seats);
        this.musicSystem = musicSystem;
        this.Cushion = cushion;
        this.fridge = fridge;
        this.AC = AC;
    }


}
