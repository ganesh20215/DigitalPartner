package com.company.interviewprogram;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        int no1 = 0, no2 = 1, no3, count = 10;
        System.out.print(no1 + " " + no2);
        for(int i = 2; i<=count; i++){
            no3 = no1 + no2;
            System.out.print(" "+ no3);
            no1 = no2;
            no2 = no3;
        }
    }
}
