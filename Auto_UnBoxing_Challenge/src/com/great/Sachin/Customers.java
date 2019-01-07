package com.great.Sachin;

import java.util.ArrayList;

public class Customers {
    String nameOfCCustomer;
     ArrayList<Double> Transaction = new ArrayList<>();

    public Customers(String nameOfCCustomer,double initialAmount){
        this.nameOfCCustomer=nameOfCCustomer;
        addAmount(initialAmount);
    }


    public double addAmount(double amount){
        Transaction.add(amount);
        return amount;
    }

    public String getNameOfCCustomer() {
        return nameOfCCustomer;
    }

    public ArrayList<Double> getTransaction() {
        return Transaction;
    }


}
