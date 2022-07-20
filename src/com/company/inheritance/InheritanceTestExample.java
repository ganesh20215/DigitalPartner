package com.company.inheritance;

public class InheritanceTestExample {

    InheritanceTestExample(){
        System.out.println("Default Constructor");
    }

    public void m1(){
        System.out.println("Method");
    }

    public void addition(int a, int b){
        System.out.println(a+b);
    }

    static{
        System.out.println("static block");
    }

    public static void main(String[] args) {
        InheritanceTestExample i = new InheritanceTestExample();
        i.addition(10, 20);
        i.addition(20, 30);
        i.addition(30, 40);
        i.addition(40, 50);
        i.addition(50, 60);
    }
}
