package com.javadatatypes;

public class Studentinformation {
	int rollnumber=97;
	String StudentName="chaithanya";
	int age=21;
	String gender="male";
	char section='A';
	int maths=50;
	int science=60;
	int physics=45;
	int chemistry=55;
	float percentage=95.5f;
	char grade='A';
	boolean passedstatus;
	public static void main(String[] args) {
		Studentinformation c1=new Studentinformation();
		System.out.println(c1.rollnumber);
		System.out.println(c1.age);
		System.out.println(c1.section);
		System.out.println(c1.maths);
		System.out.println(c1.science);
		System.out.println(c1.physics);
		System.out.println(c1.chemistry);
		System.out.println(c1.percentage);
		System.out.println(c1.grade);
		System.out.println(c1.passedstatus);
		
			
	}

}
