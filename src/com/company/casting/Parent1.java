package com.company.casting;

public class Parent1 {

    Parent1(){
        System.out.println("Parent1 constructor");
    }

    Parent1(int a, int b){
        System.out.println("parent class parameterized constructor " + (a+b));
    }

    int a = 20;

    public void m1() {
        System.out.println("parent m1 method");
    }
}
