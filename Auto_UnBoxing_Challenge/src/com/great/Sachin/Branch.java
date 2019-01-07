package com.great.Sachin;

import java.util.ArrayList;

public class Branch {
    ArrayList<Customers> CustomerBranch = new ArrayList<>();
    String BranchName;

    public Branch(String BranchName){
        this.BranchName = BranchName;
    }
    public ArrayList<Customers> getCustomers(){
        return CustomerBranch;
    }

    public void customerList(){
        for(int i =0;i<CustomerBranch.size();i++){
            System.out.println("Customer name "+CustomerBranch.get(i).getNameOfCCustomer());
        }
    }
    public String getCustomerName(String branchName){
        Customers customers = findCustomer(branchName);
        if(customers!=null){
            return customers.getNameOfCCustomer();
        }
        else return null;
    }

    public void customerTransaction(String CustomerName){
        Customers customers = findCustomer(CustomerName);
        if(customers!=null){
            int n = customers.getTransaction().size();
            for(int i=0;i<n;i++){
                System.out.println("Amount  added into : "+ customers.getNameOfCCustomer()+
                        " Accounts : "+ customers.getTransaction());
            }
        }
    }

    public void addCustomer(String name, Double initialAmount){
        if(findCustomer(name)==null)
        CustomerBranch.add(new Customers(name,initialAmount));
        //return new Customers(name,initialAmount);
    }

    public void addAdditionalAmount(String name,Double amount){
        Customers position = findCustomer(name);
        if(findCustomer(name)!=null){
            position.addAmount(amount);
        }
        return;
    }

    public int searchContacts(String name){
        for(int i =0;i<CustomerBranch.size();i++){
            Customers customerB= CustomerBranch.get(i);
            if(customerB.getNameOfCCustomer().equals(name))
            return i;
        }

    return -1;
    }

    public String getBranchName() {
        return BranchName;
    }


    public Customers findCustomer(String name){
        for (int i =0;i<CustomerBranch.size();i++){
            Customers customers1 = CustomerBranch.get(i);
            if(customers1.getNameOfCCustomer().equals(name))
                return customers1;
        }
        return null;
    }

}
