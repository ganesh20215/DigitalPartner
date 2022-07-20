package com.company.accessmodifier;

public class Simple {

    int simpletest = 10;
    String MAX = "Test";
    final int CHECK_CHECK = 50;


    public void test(){
        System.out.println("");
    }

    public void testTest(){

    }
    public static void main(String[] args) {
        ExampleOfPrivate ep2 = new ExampleOfPrivate();
        Simple s = new Simple();


//        PrivatConstructor pc = new PrivatConstructor();
        System.out.println(s.CHECK_CHECK);
        ep2.msg();
        s.testTest();
        ProtectedAccessModifiers p = new ProtectedAccessModifiers();
    }
}
