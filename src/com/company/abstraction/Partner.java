package com.company.abstraction;

public abstract class Partner {

    int a, b, c;

    Partner(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract void m1();

    public void m2() {
        System.out.println();
    }

    public static void m3() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {

    }
}
