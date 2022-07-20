package com.company.finalkeyword;

public class Student{
    int id;
    String name;
    final int PAN_CARD_NUMBER;
    static final int data;//static blank final variable

    static {
        data = 50;
    }

    Student() {
        PAN_CARD_NUMBER = 10;
        System.out.print("hhee");
        System.out.println(" " + PAN_CARD_NUMBER);
        System.out.print("hhee");
        System.out.println(" " + PAN_CARD_NUMBER);
    }

    final void test1(int a, int b){
        int c = a;
        int d = b;
    }

    final void test1(int a, int b, int e){
        int c = a;
        int d = b;

    }
    public static void main(String[] args) {
        Student s = new Student();
    }
}
