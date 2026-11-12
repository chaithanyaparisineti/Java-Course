package com.Multithreading;
class LoadingThread extends Thread{
	public void run() {
     	try {
			for(int i=1;i<=5;i++) {
			System.out.println("Thread Loading...");
			Thread.sleep(1000);
			}
		}catch(InterruptedException e){
		System.out.println(e);
	}
  }
}
    class WaitingThread extends Thread{
	public void run() {
	try {
			for(int i=1;i<=3;i++) {
				System.out.println("Please Wait...");
				Thread.sleep(1000);
		}
     	}catch(InterruptedException e){
 			System.out.println(e);
		}
	}
}
    public class LoadingScreen {
	public static void main(String[] args) {
		LoadingThread l1=new LoadingThread ();
		WaitingThread  w1=new WaitingThread ();

		l1.start();
		w1.start();
	}

}
