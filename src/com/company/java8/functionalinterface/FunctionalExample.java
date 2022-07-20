package com.company.java8.functionalinterface;

@FunctionalInterface
public interface FunctionalExample {

    void m1();


    default void m2() {
        System.out.println("Default Interface");
    }

    default void m3() {
        System.out.println("Default Interface");
    }

    default void m4() {
        System.out.println("Default Interface");
    }

    static void m5() {
        System.out.println("static method");
    }
}
