package com.company.interviewprogram;

import java.util.Scanner;

public class SwappingNumberUsingThirdVariable {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter the x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before swapping of two numbers " + x + " " + y);
        temp = x;
        x=y;
        y = temp;
        System.out.println("After Swapping " + x +" "+ y);
    }
}
