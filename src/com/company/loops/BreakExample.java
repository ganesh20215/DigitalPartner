package com.company.loops;

public class BreakExample {
    public static void main(String[] args) {
        //using for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                //breaking the loop
                break;
            }
            System.out.println(i);
        }
    }
}