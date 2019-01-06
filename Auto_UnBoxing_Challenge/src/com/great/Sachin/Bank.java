package com.great.Sachin;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch> bankBranch = new ArrayList<>();

    public Branch addBranch(String name){
        bankBranch.add(new Branch(name));
        return new Branch(name);
    }

    public void addCustomer(String branch,String name,Double amount){
        if(searchBranch(branch)>=0){
        bankBranch.add(searchBranch(name),new);

        }
    }

    public int searchBranch(String name){
        for(int i =0;i<bankBranch.size();i++){
            Branch customerB= bankBranch.get(i);
            if(customerB.getBranchName().equals(name));
            return i;
        }

        return -1;
    }

}
