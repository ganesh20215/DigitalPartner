package com.company.interviewprogram;


public class Test {
    public static void main(String[] args) {

        String s = "Ganesh Arun Jadhav";
        StringBuffer sb = new StringBuffer(s);
        for(int i=s.length()-1; i>=0; i--){
            if(Character.isUpperCase(s.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }else {
                sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
            System.out.print(sb.charAt(i));
        }
    }
}
