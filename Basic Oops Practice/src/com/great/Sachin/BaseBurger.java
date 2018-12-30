package com.great.Sachin;
import java.util.Scanner;

public class BaseBurger {
    public static int price=60;
    private int meat;
    public String name;
    private String BreadRoll;
    private String tomato;
    private String lettuce;
    private String carrot;
    private String cheese;

    Scanner sc=new Scanner(System.in);

    public BaseBurger(String name,int price,int meat,String BreadRoll){
        this.name=name;
        this.price=price;
        this.meat=meat;
        this.BreadRoll=BreadRoll;
    }

    public int getPrice() {
        System.out.println("The price now for "+name+" is : "+ price);
        return price;
    }

    public String getTomato() {
        System.out.println("Tomato is added");
        price +=20*howMany();
        return tomato;
    }

    public String getLettuce() {
        System.out.println("Lettuce is added");
        price +=30*howMany();
        return lettuce;
    }

    public String getCarrot() {
        System.out.println("Carrot is added");
        price +=40*howMany();
        return carrot;
    }

    public String getCheese() {
        System.out.println("Cheese is added");
        price +=50*howMany();
        return cheese;
    }
    public int howMany(){
        System.out.println("Enter how many do you want of these");
        int x = sc.nextInt();
        return x;
    }
}
