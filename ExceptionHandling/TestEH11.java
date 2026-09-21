package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestEH11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method Started");
	try {	
		String name=null;
		System.out.println("Enter Student name:"+name.length());
	} 
	catch(NullPointerException e) {
		System.out.println("Error String name cannot be null");
	}
	try {
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		System.out.println("age:"+age);
	}
	catch(InputMismatchException e) {
		System.out.println("Enter age as a number");
	}
	try {
		System.out.println("Enter total marks:");
		int marks=sc.nextInt();
		
		System.out.println("Enter total subjects:");
		int subjects=sc.nextInt();
		
		double average=marks/subjects;
		System.out.println("Total Average:"+average);
	}catch(ArithmeticException e) {
		System.out.println("cannot divide with zero");
	}
	try {
		int[]marks= {80,85,98,99,95};
		System.out.println("Enter index(0-4):");
		int index=sc.nextInt();
		
		System.out.println("Marks:"+marks[index]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invald index");
	}
	finally {
		System.out.println("Finally block execued");
	}	
	System.out.println("main method ended");
	}
}
