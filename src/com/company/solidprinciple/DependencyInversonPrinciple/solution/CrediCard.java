package com.company.solidprinciple.DependencyInversonPrinciple.solution;

public class CrediCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using credit card");
    }


}
