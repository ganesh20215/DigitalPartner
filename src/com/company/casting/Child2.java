package com.company.casting;

public class Child2 extends Parent1{

    int a = 40;

    Child2(){
        super(10, 20);
        System.out.println("Child2 constructor");
    }

//    public void m1() {
//        System.out.println(super.a);
//        super.m1();
//        System.out.println("child m1 method");
//    }

    public static void main(String[] args) {
        Child2 c = new Child2();
//        c.m1();
    }
}
