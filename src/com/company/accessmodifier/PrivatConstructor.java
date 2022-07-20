package com.company.accessmodifier;

public class PrivatConstructor {
    private PrivatConstructor(){
        System.out.println("Hello I Private Constructor is calling");
    }
    int x = 50;

    public static void main(String[] args) {
        PrivatConstructor p = new PrivatConstructor();
        System.out.println("  " + p.x);


    }
}
