package com.company.java8.lambdaexpression;

interface Interf {
    void m1();
}

public class LambdaWithFunctional {
    public static void main(String[] args) {
        Interf i = () -> System.out.println("Hello Lambda Expression");
        i.m1();
    }
}
