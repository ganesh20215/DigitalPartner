package com.company.interviewprogram;

public class DuplicateNumberOccurrance {

    public static void countOccurrences(int a[]){
        int res = 0, x=0;
        for(int i=0; i<a.length; i++){
            if (x==a[i]){
                res++;
                System.out.println(res);
            }


        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 89, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        countOccurrences(a);

    }
}
