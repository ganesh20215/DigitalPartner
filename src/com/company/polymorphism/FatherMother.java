package com.company.polymorphism;

public class FatherMother {

    FatherMother(){
        System.out.println("Parent class constructor");
    }

    public int marriage(int a, int b){
        System.out.println("Marriage with parent choice " + (a+b));
        return a+b;
    }

}
