package com.company.thiskeyword;

public class ThisMethod {
   String s;
    ThisMethod(){
        System.out.println("default constructor");
    }

    ThisMethod(int x){
        this();
        System.out.println("Parameterized Constructor " + x);
    }

    void test(String test) {
        System.out.println("method " + test);
        this.test1();
    }

    void addition(int a, int b, int c){

    }

    void test1() {
        System.out.println("Calling method with the help of this keyword");
    }

    public static void main(String[] args) {
        ThisMethod tm = new ThisMethod(10);
        tm.test("Ganesh");
        tm.test("Digital");
        tm.test("Partner");
        tm.test("Checking");
        System.out.println(tm.s);
    }
}
