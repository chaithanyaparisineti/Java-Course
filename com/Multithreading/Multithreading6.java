package com.Multithreading;
class Threads extends Thread {
	String Name;
	int age;
	String course;
	double fee;
	public Threads(String Name, int age, String course, double fee) {
		this.Name = Name;
		this.age = age;
		this.course = course;
		this.fee = fee;
	}
	@Override
	public void run() {
		System.out.println("Name:"+Name+
				",age:"+age+
				",age:"+age+
				",course:"+course+
				",fee:"+fee
				);
}
}
public class Multithreading6 {

	public static void main(String[] args) {
		
		 Threads t1=new  Threads("chaithanya", 22, "java", 27000);
		 Threads t2=new  Threads("ram", 23, "python", 26000);
		 Threads t3=new  Threads("zara", 21, "java", 27000);
		 
		    t1.start();
			t2.start();
			t3.start();

	}

}
