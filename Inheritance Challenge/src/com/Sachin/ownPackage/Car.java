package com.Sachin.ownPackage;

public class Car extends Vehicle{
    public String Steering;
    public int gears;
    public int seats;
    public int speed;

    public Car(int wheels, int doors, int headLight,
               String name,int speed, String steering, int gears, int seats) {
        super(4,4,2,"Tarzan");
        this.gears=gears;
        this.seats=seats;
        this.Steering=steering;
        this.speed=speed;
    }

    public void handStreeing (){
        System.out.println("Car is being streed by user");
    }

    public void  setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }

    public void gearChanging (int gearNumber){
        if(gearNumber==0){
            int speed0=gearNumber*getSpeed();
            System.out.println("Car is not moving : Speed is :" +speed0);
        }
        else if(gearNumber==1){
            int speed1=gearNumber*getSpeed();
            System.out.println("Car is not moving : Speed is :" +speed1);
        }
        else if(gearNumber==2){
            int speed2=gearNumber*getSpeed();
            System.out.println("Car is not moving : Speed is :" +speed2);
        }
        else if (gearNumber==3){
            int speed3=gearNumber*getSpeed();
            System.out.println("Car is not moving : Speed is :" +speed3);
        }
    }

}
