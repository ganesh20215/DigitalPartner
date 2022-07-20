package com.company.solidprinciple.DependencyInversonPrinciple.solution;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new com.company.solidprinciple.DependencyInversonPrinciple.solution.DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
