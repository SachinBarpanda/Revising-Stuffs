package com.great.Sachin;

import java.util.ArrayList;

public class Branch {
    ArrayList<Customers> CustomerBranch = new ArrayList<>();
    String BranchName;

    Customers customers = new Customers("Sachin",900);

    public Branch(String BranchName){
        this.BranchName = BranchName;
    }

    public Branch(String name,Double initialAmount){

    }

    public Customers addCustomer(String name, Double initialAmount){

        CustomerBranch.add(new Customers(name,initialAmount));
        return new Customers(name,initialAmount);
    }
    public void addAdditionalAmount(String name,Double amount){
        if(searchContacts(name)>=0){
            int position = searchContacts(name);
            CustomerBranch.add(position,new Customers(amount));
        }
    }

    public int searchContacts(String name){
        for(int i =0;i<CustomerBranch.size();i++){
            Customers customerB= CustomerBranch.get(i);
            if(customerB.getNameOfCCustomer().equals(name));
            return i;
        }

    return -1;
    }

    public ArrayList<Customers> getCustomerBranch() {
        return CustomerBranch;
    }

    public String getBranchName() {
        return BranchName;
    }

    public Customers getCustomers() {
        return customers;
    }
}
