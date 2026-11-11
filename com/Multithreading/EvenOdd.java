package com.Multithreading;
class EvenThread extends Thread{
	@Override
public void run() {
	System.out.println("Prints Even Numbers");
	for(int i=2;i<=20;i+=2) {	
	
	System.out.println(i);
	}
}
}
class OddThread extends Thread{
	@Override
public void run() {
	System.out.println("Prints Odd Numbers");
	for(int i=1;i<=19;i+=2) {	
	System.out.println(i);
	}
}
}
public class EvenOdd {
	public static void main(String[] args) {
		EvenThread E1=new EvenThread();
		OddThread o1=new OddThread();
		E1.start();
		o1.start();

	}

}
