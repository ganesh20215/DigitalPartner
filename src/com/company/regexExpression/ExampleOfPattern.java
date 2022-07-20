package com.company.regexExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleOfPattern {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("aparna kulkarni");
        while (m.find()){
            count++;
            System.out.println(m.start() + "-----------" + m.end() + "-------------" + m.group());
        }
        System.out.println("Total Count of the pattern a is " + count);
    }
}
