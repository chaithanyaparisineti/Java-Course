package com.Multithreading;
class Student extends Thread{
	String StudentName;
	double attendance;
	
	Student(String StudentName,double attendance){
		this.StudentName=StudentName;
		this.attendance=attendance;
	}
	@Override
	public void run() {
	    System.out.println(
	        "Student Name: " + StudentName +
	        ", Attendance: " + attendance + "%"
	    );
	}}
public class StudentAttendance {
	public static void main(String[] args) {
		Student s1=new Student("chaithanya",90 );
		Student s2=new Student("Ram",80 );
		Student s3=new Student("Hanu",75);
		
		s1.start();
		s2.start();
		s3.start();
	}

}
