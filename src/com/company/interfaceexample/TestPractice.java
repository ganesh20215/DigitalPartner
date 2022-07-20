package com.company.interfaceexample;

public class TestPractice implements Printable, Digital{


    @Override
    public void m1() {

    }

    @Override
    public void print() {
        System.out.println("common Implemenatation");
    }


    public static void main(String[] args) {
        TestPractice t = new TestPractice();
        t.print();
    }

}
