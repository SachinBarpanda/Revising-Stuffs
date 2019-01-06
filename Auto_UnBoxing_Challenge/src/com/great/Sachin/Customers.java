package com.great.Sachin;

import java.util.ArrayList;

public class Customers {
    private String nameOfCCustomer;
    private ArrayList<Double> Transaction = new ArrayList<>();

    public Customers(String nameOfCCustomer,double initialAmount){
        this.nameOfCCustomer=nameOfCCustomer;
        addAmount(initialAmount);
    }
    public Customers(double amount){
        addAmount(amount);
    }

    public void addAmount(double amount){
        Transaction.add(amount);
    }

    public String getNameOfCCustomer() {
        return nameOfCCustomer;
    }

    public ArrayList<Double> getTransaction() {
        return Transaction;
    }


}
