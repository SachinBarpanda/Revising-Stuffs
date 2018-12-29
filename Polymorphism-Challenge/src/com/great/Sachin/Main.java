package com.great.Sachin;

class Car{
    public int StrokeEngine;
    private int cylinder;
    private int wheel;
    private String name;
    public boolean duplexEngine;
    public int speed;

    public Car(int StrokeEngine,int cylinder,int wheel, String name, boolean duplexEngine){
        this.cylinder=cylinder;
        this.wheel = wheel;
        this.name = name;
        this.duplexEngine= duplexEngine;
        this.StrokeEngine=StrokeEngine;
    }

    public int getStokeEngine() {
        return StrokeEngine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheel() {
        return wheel;
    }

    public String getName() {
        return name;
    }

    public boolean isDuplexEngine() {
        return duplexEngine;
    }

    public void startEngine(){
        System.out.println("Engine started!");
    }

    public void accelarate(){
        if(duplexEngine){
            speed = 10 * StrokeEngine;
            System.out.println("Accelearating car at : "+ speed + " m/s^sq");
        }
    }
    public void brake(){
        if(speed > 0){
            int stop = speed / StrokeEngine;
            System.out.println(name +" is stopping at :  "+ stop + "m/s^sq");
        }
        else System.out.println("Car is not moving ");
    }
}

class Buggati extends Car{

    public Buggati(int StrokeEngine,int cylinder,int wheel, String name, boolean duplexEngine){
            super(6,8,4,"Buggati",true);
        }
    public void startEngine(){
        System.out.println("\n"+"Buggati's Duplex Engine started!");
    }
    public void accelarate(){
        if(duplexEngine){
            speed = 20 * StrokeEngine;
            System.out.println("Accelearating car at : "+ speed + " m/s^sq");
        }
    }
}

class Lamborgini extends Car {

    public Lamborgini(int StrokeEngine, int cylinder, int wheel, String name, boolean duplexEngine) {
        super(StrokeEngine, cylinder, wheel, "Lamborgini", duplexEngine);
    }
    public void startEngine(){
        System.out.println("\n"+" Lamborgini jet Engine started!");
    }
    public void accelarate(){
        if(duplexEngine){
            speed = 40 * StrokeEngine;
            System.out.println("Accelearating car at : "+ speed + " m/s^sq");
        }
    }
}

class Ferrari extends Car{
    public Ferrari(int StrokeEngine, int cylinder, int wheel, String name, boolean duplexEngine) {
        super(StrokeEngine, cylinder, wheel, "Ferrai", duplexEngine);
    }

    @Override
    public void startEngine() {
        System.out.println("\n"+"Ferrari's Rocket engine Started");
    }

    @Override
    public void accelarate() {
        if(duplexEngine){
            speed = 80 * StrokeEngine;
            System.out.println("Accelearating car at : "+ speed + " m/s^sq");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car= new Car(4,4,4,"Ford",false);
        Buggati buggati = new Buggati(8,8,4,"Veron",true);
        Lamborgini lamborgini = new Lamborgini(6,6,4,"Terrain",true);
        Ferrari ferrari=new Ferrari(6,8,4,"Zac",true);

        ferrari.startEngine();
        ferrari.accelarate();
        ferrari.brake();

        lamborgini.startEngine();
        lamborgini.accelarate();
        lamborgini.brake();

        buggati.startEngine();
        buggati.accelarate();
        buggati.brake();
    }
}
