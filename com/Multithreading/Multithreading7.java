package com.Multithreading;
class TestThread extends Thread{
	
@Override
public void run() {
	System.out.println("Thread is Running");
}
}
public class Multithreading7 {

	public static void main(String[] args) {
		
TestThread t1=new TestThread();
t1.start();
t1.start();
	}

}
//output:-IllegalThreadStateException.
//Exception in thread "main" Thread is Running
//java.lang.IllegalThreadStateException
//	at java.base/java.lang.Thread.start(Thread.java:1416)
//	at com.Multithreading.Multithreading7.main(Multithreading7.java:15)
