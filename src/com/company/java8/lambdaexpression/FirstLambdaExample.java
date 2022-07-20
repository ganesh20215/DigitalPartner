package com.company.java8.lambdaexpression;

public class FirstLambdaExample {

    public void m1(){
        System.out.println("Without lambda expression method");
    }

//    () -> System.out.println("Hello");

    public void m2(int a, int b){
        System.out.println("The sum of " + (a+b));
    }

//    (int a, int b) -> {System.out.println("The sum is " + (a+b));}
//    (a, b) -> System.out.println("The sum is " + (a+b));

    public int m3(int n){
        return n*n;
    }

//    (int n) -> {return n*n; }
//    (int n) -> n*n;
//    (int n) -> n*n;
//    n -> n*n;

    public int m1(String s){
        return s.length();
    }

//    s-> s.length();


    public static void main(String[] args) {

    }
}
