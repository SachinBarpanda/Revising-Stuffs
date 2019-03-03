package com.great.Sachin;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch> bankBranch = new ArrayList<>();
    String name;
    public Bank(String name){
        this.name=name;
    }
    public void addBranch(String name){

        bankBranch.add(new Branch(name));
            System.out.println(name+" branch added");
    }

    public void addCustomer(String branch,String name,Double amount){
        if(searchBranch(branch)>=0){
            Branch branch1=findBranch(branch);

        branch1.addCustomer(name,amount);

        }
    }

    public void addTransactionInSameBranch(String branch,String name,Double amount){
        if(searchBranch(branch)>=0){
            Branch branch1 = findBranch(branch);
            branch1.addAdditionalAmount(name,amount);
        }
    }

    public int searchBranch(String name){
        for(int i =0;i<bankBranch.size();i++){
            Branch branch= bankBranch.get(i);
            if(branch.getBranchName().equals(name))
            return i;
        }

        return -1;
    }

    public Branch findBranch(String name){
        for (int i =0;i<bankBranch.size();i++){
            Branch branch = bankBranch.get(i);
            if(branch.getBranchName().equals(name))
                return branch;
        }
        return null;
    }

    public void printBranchDetails(String BranchName){
        Branch branch1 = findBranch(BranchName);
        branch1.customerList();

        ArrayList<Customers> customers1 = branch1.getCustomers();
        for(int i=0;i<customers1.size();i++) {
            Customers customers = customers1.get(i);
            ArrayList<Double> Transaction = customers.getTransaction();
            for(int j=0 ;j<Transaction.size();j++){
                System.out.println("Amount : +"+Transaction.get(i));
            }
        }
        //Customers customers1 = new Customers("Sam",90000);


    }


}
