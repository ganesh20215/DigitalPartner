package com.company.java8.defaultmethodinterface;

interface Interface1 {

    default void m1() {
        System.out.println("default method m1");
    }

    void m2();
}

interface Interface2 {


    default void m1() {
        System.out.println("default method m1");
    }

    void m2();
}

public class ImplementedClass implements Interface1, Interface2 {

    public void m1() {
        System.out.println("Override default Method");
    }

    @Override
    public void m2() {
//        System.out.println("m2 method");
        Interface1.super.m1();
        Interface2.super.m1();
    }

    public static void main(String[] args) {
        ImplementedClass ic = new ImplementedClass();
        ic.m1();
        ic.m2();
    }
}
