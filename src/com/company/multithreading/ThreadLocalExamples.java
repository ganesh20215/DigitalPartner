package com.company.multithreading;

public class ThreadLocalExamples implements Runnable{
    int counter;
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public void run() {
        counter++;

        if(threadLocal.get() != null) {
            threadLocal.set(threadLocal.get().intValue() + 1);
        } else {
            threadLocal.set(0);
        }
        System.out.println("Counter: " + counter);
        System.out.println("threadLocal: " + threadLocal.get());
}
    public static void main(String[] args) {
        ThreadLocalExamples runnableInstance = new ThreadLocalExamples();
        Thread t1 = new Thread(runnableInstance);
        Thread t2 = new Thread(runnableInstance);
        // this will call run() method
        t1.start();
        t2.start();
    }
}