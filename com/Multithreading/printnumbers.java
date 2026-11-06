package com.Multithreading;
class Mythread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class printnumbers {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		 Mythread t = new Mythread();
           t.start();
           System.out.println("Main method Ended");
	}

}
