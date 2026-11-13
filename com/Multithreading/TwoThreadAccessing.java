package com.Multithreading;
class counter{
	int count=0;
	synchronized void increament() {
		count++;
	}
}
class counter2 extends Thread{
	counter c;
	counter2(counter c){
		this.c=c;
	}
	public void run() {
		for(int i=1;i<=1000;i++) {
			c.increament();
		}
	}
}
public class TwoThreadAccessing {
	public static void main(String[] args)throws InterruptedException {
		
		counter c=new counter();
		counter2 c1=new counter2(c);
		counter2 c2=new counter2(c);
		c1.start();
		c2.start();
		
		c1.join();
		c2.join();
		System.out.println("Final Counter:"+c.count);
	}

}
