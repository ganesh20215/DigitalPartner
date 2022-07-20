package com.company.interfaceexample;

public interface Printable {
    int a = 10;  //public static final
    int b = 20;
    int c = 30;

    void print();

    default void m2(){
        System.out.println("Default method");
    }

    static void m3(){
        System.out.println("static method");
    }

}
