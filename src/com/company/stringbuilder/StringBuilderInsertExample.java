package com.company.stringbuilder;

public class StringBuilderInsertExample {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.insert(0, "Java");//now original string is changed
        System.out.println(sb);//prints HJavaello
    }
}