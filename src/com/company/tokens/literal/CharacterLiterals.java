package com.company.tokens.literal;

public class CharacterLiterals {
    public static void main(String[] args) {
        // single character literl within single quote
        char ch = 'a';
        // It is an Integer literal with octal form
//        char b = 0789;
        // Unicode representation
        char c = '\u0061';

        System.out.println(ch);
//        System.out.println(b);
        System.out.println(c);

        // Escape character literal
        System.out.println("\"  is a symbol");
    }
}