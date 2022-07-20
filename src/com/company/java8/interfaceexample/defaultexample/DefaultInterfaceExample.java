package com.company.java8.interfaceexample.defaultexample;

import java.util.function.Function;
import java.util.function.Predicate;

public class DefaultInterfaceExample {

    public static int squareIt(int no) {
        return no * no;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i*i;
        Predicate<Integer> p=i->i%2==0;
        System.out.println("The square of " + squareIt(4));
        System.out.println(f.apply(5));
        System.out.println(p.test(4));
    }

}
