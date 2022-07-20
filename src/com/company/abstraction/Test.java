package com.company.abstraction;


import com.company.java8.interfaceexample.defaultexample.DefaultInterfaceExample;


public class Test extends Partner {

    int d;

    Test(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {


        DefaultInterfaceExample defaultInterfaceExample = new DefaultInterfaceExample();
    }
}

