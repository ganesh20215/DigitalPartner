package com.company.exceptionalhandling;

public class HandleExceptionUsingTryCatchBlockThrows {
    void method() throws ArithmeticException {
        System.out.println(10/0);
        throw new ArithmeticException("device error");
    }
}

class TestThrows2 {
    public static void main(String args[]) {
        try {
            HandleExceptionUsingTryCatchBlockThrows m = new HandleExceptionUsingTryCatchBlockThrows();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }
}