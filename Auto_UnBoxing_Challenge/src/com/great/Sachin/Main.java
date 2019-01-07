package com.great.Sachin;

public class Main {
    public static void main(String[] args) {
        Bank bank =new Bank("India");
        bank.addBranch("Jyoti Vihar");
        bank.addCustomer("Jyoti Vihar","Namkeen",14000.0);
        bank.addTransactionInSameBranch("Jyoti Vihar","Namkeen",14000.0);
        bank.printBranchDetails("Jyoti Vihar");
        Branch branch =new Branch("Jyoti Vihar");
        branch.customerTransaction("Namkeen");
    }
}
