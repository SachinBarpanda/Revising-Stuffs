package com.great.Sachin;

public class Main {
    public static void main(String[] args) {
        BaseBurger base = new BaseBurger("Base Burger",60,4,"Simple Roll");
        base.getCarrot();
        base.getCheese();
        base.getPrice();

        HealthyBurger health=new HealthyBurger(80,4,"rye Bread");
        health.getmilk();
        health.getPrice();

        DeluxeBurger delux =new DeluxeBurger(6,"Delux Bread","Pepsi","Cadbury");
        delux.getCarrot();
        delux.getPrice();
    }
}
