package com.company.polymorphism;

public class Daughter extends FatherMother{

    Daughter(){
        System.out.println("Child class constructor");
    }

    @Override
    public int marriage(int a, int b) {
        System.out.println("I want to marry with my own choice " + (a+b));
        return a+b;
    }

    public static void main(String[] args) {
        FatherMother f = new Daughter();
        Daughter d = new Daughter();
    }

}
