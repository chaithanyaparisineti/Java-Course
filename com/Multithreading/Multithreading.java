package com.Multithreading;

class NumberPrinter {
    int number = 1;
    int limit = 10;
    
    public synchronized void printOdd() {
        while (number <= limit) {
            while (number % 2 == 0 && number <= limit) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (number <= limit) {
                System.out.println("Odd: " + number);
                number++;
                notifyAll();
            }
        }
        notifyAll();
    }

    public synchronized void printEven() {
        while (number <= limit) {
            while (number % 2 != 0 && number <= limit) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (number <= limit) {
                System.out.println("Even: " + number);
                number++;
                notifyAll();
            }
        }
        notifyAll();
    }
}
public class Multithreading {

    public static void main(String[] args) {

        NumberPrinter obj = new NumberPrinter();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}
