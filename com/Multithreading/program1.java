package com.Multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
}

public class program1 {

    public static void main(String[] args) {

        System.out.println("Main thread Started");

        MyThread t = new MyThread();

        t.start();

        System.out.println("Main thread Ended");
    }
}