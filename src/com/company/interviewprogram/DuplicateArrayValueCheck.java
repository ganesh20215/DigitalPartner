package com.company.interviewprogram;

public class DuplicateArrayValueCheck {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 6, 5, 7, 8, 8};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
