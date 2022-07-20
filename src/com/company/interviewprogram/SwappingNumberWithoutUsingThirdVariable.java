package com.company.interviewprogram;

import java.util.Scanner;

public class SwappingNumberWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before Swapping the data " + x + " " + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swapping the data " + x + " " + y);
    }
}
