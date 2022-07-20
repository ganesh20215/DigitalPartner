package com.company.constructor;

public class ConstructorTest {

    int d= 20;
    int e = 30;

    ConstructorTest(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void m1(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        ConstructorTest ct = new ConstructorTest(10, 20);
        ConstructorTest ct1 = new ConstructorTest(30, 40);
    }
}
