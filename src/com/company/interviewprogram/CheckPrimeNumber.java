package com.company.interviewprogram;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " number is prime");
        else
            System.out.println(num + " number is not a prime");
    }

}


//    int temp = 0, num;
//    boolean isPrime = true;
//    Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//                if(num%2==0 && num>=2){
//                isPrime = false;
//                }
//                else {
//                isPrime = true;
//                }
//                if(isPrime){
//                System.out.println("Number is prime number");
//                }else {
//                System.out.println("Not a prime number");
//                }