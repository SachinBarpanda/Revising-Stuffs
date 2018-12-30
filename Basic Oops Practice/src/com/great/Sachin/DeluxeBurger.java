package com.great.Sachin;

public class DeluxeBurger extends BaseBurger{
        private String cola;
        private String chocolates;

    public DeluxeBurger( int meat, String BreadRoll,String cola,String chocolates) {
        super("Delux Burger",120, meat, BreadRoll);
        this.chocolates=chocolates;
        this.cola=cola;
    }
    public String getTomato() {
        System.out.println("Addition Not Allowed for DeluxBurger");
        return null;
    }

    public String getLettuce() {
        System.out.println("Addition Not Allowed for DeluxBurger");
        return null;
    }

    public String getCarrot() {
        System.out.println("Addition Not Allowed for DeluxBurger");
        return null;
    }

    public String getCheese() {
        System.out.println("Addition Not Allowed for DeluxBurger");
        return null;
    }
}
