package com.company.collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Declaring the ArrayList with
        // initial size n
//        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList al = new ArrayList();

        // Appending new elements at
        // the end of the list
//        for (int i = 1; i <= 5; i++) {
//            al.add(i);
//        }
//        // Printing elements
//        System.out.println(al);

        // Remove element at index 3
        al.add("Digital");
        al.add("Partner");
        al.add("Digital");
        al.add("very");
        al.add("good");
        al.add("Institute we have");
//        al.remove(3);

        // Displaying the ArrayList
        // after deletion
//        System.out.println(al);

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + " ");
        }

        al.clear();
        System.out.println("clear all data " + al);
        System.out.println(al.isEmpty());
    }
}