package com.company.java8.staticMethodExample;

interface Interf{
    static void m1(){
        System.out.println("static method");
    }

    static void main(String[] args) {
        System.out.println("interface main method");
    }
}

class StaticMethodExample implements Interf{
    public static void main(String[] args) {
        Interf.m1();
    }
}
