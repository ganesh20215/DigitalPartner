package com.company.java8.lambdaexpression;


interface InterF2 {
    void add(int a, int b);
}

public class LambdaWithFunctionSecond {
    public static void main(String[] args) {
        InterF2 i = (a, b) -> System.out.println("The sum is : " + (a + b));
        i.add(10, 20);
    }
}
