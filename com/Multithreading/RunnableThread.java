package com.Multithreading;
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Thread is Running..");
	}
}
public class RunnableThread {

	public static void main(String[] args) {
		MyRunnable r1=new MyRunnable();
		Thread t1=new Thread(r1);
		t1.start();

	}

}
