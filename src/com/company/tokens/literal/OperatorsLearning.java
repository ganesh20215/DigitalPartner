package com.company.tokens.literal;

public class OperatorsLearning {
    public static void main(String[] args) {
        {
            // Initial values
            int a = 5;
            int b = 7;
            int c = 10;
            int d = 9;

            //<< Left shift operator
            //0101<<2 = 010100
            System.out.println("Left shift operator " + (a << 2));

           //>> Right shift operator
            //0101>>2 = 0001
            System.out.println("Right shift operator " + (a >> 2));

            //>> Unsigned right shift operator
            //0101>>>2 = 0001
            System.out.println("Unsigned shift operator " + (a >>> 2));

            // bitwise and
            // 0101 & 0111=0101 = 5
            System.out.println("a&b = " + (a & b));

            // bitwise or
            // 0101 | 0111=0111 = 7
            System.out.println("a|b = " + (a | b));

            // bitwise xor
            // 0101 ^ 0111=0010 = 2
            System.out.println("a^b = " + (a ^ b));

            // bitwise not
            // ~0101=1010
            // will give 2's complement of 1010 = -6
            System.out.println("~a = " + ~a);

            // can also be combined with
            // assignment operator to provide shorthand
            // assignment
            // a=a&b
            // 0101 & 0111 = 0101
            a &= b;
            System.out.println("a= " + a);

            // numbers using ternary operator
            // ?:

//            int a = 5;
//            int b = 7;
//            int c = 10;
//            int d = 9;
            int max = (a > b) ? a : b;
            System.out.println("maximum is = " + max);

            if (a <= b && c <= d) {
                System.out.println("&& got success");
            } else {
                System.out.println("&& Condition got fail");
            }
        }
    }
}

