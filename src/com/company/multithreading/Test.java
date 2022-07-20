package com.company.multithreading;

public class Test implements Runnable {

    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public void run() {
        threadLocal.set((int) (Math.random() * 50D));

        System.out.println("Thread " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        Test t1 = new Test();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        thread1.start();
        thread2.start();
    }
}
