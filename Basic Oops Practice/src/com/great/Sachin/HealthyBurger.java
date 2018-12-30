package com.great.Sachin;

public class HealthyBurger extends BaseBurger {
    private String vegLeaf;
    private String milk;

    public HealthyBurger(int price, int meat, String BreadRoll) {
        super("Hamburger",price, meat, "rye Bread roll");
    }

    public String getVegLeaf() {
        System.out.println("Veg leaf is added");
        price +=20*howMany();
        return vegLeaf;
    }

    public String getmilk() {
        System.out.println("Milk is added");
        price +=20*howMany();
        return milk;
    }
}
