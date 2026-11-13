package com.Multithreading;
class NumberPrinting {
    int number = 1;
    int limit = 20;

    synchronized void printOdd() {
        while (number <= limit) {

            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= limit) {
                System.out.println("Odd Thread: " + number);
                number++;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (number <= limit) {

            while (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= limit) {
                System.out.println("Even Thread: " + number);
                number++;
                notify();
            }
        }
    }
}

public class OddEven {
    public static void main(String[] args) {

        NumberPrinting obj = new NumberPrinting();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}
