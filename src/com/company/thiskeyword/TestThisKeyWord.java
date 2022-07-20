package com.company.thiskeyword;

public class TestThisKeyWord {

    int rollNumber;
    String name;
    float fee;

    TestThisKeyWord(int rollNumber, String name, float fee){
        this();
        this.rollNumber = rollNumber;
        this.name = name;
        this.fee = fee;

    }

    TestThisKeyWord(){
        System.out.println("Default Constructor");
    }

    void display(){
        System.out.println(rollNumber + " " + name + " " + fee);
        m1();
    }

    void m1(){
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        TestThisKeyWord t1 = new TestThisKeyWord(1, "Mangesh", 2.5f);
        t1.display();

    }
}
