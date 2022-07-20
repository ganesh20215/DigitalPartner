package com.company.accessmodifier;

public class ProtectedAccessModifiers {
     protected ProtectedAccessModifiers(){
        System.out.println("protected constructor I am having");
    }

    protected int i = 10;
    protected void test(){

    }


    public static void main(String[] args) {
        ProtectedAccessModifiers p = new ProtectedAccessModifiers();
    }
}
