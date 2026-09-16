package ExceptionHandling;
import java.util.Scanner;
public class TestEH1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Main method Started");
	System.out.println("Enter a number1: ");
	try {
	int a=sc.nextInt();
	//if input num1=10 and num2=0 ------->Exception in thread "main" java.lang.ArithmeticException: / by zero
	//at ExceptionHandling.TestEH1.main(TestEH1.java:13)

	System.out.println("Enter a number2: ");
	int b=sc.nextInt();
	//if we enter ten as input for num1 then java.util.InputMismatchException.
	
	int c=a/b;
// if any errors in try {}then it will not execute and moves next and prints catch{} and other statements.
	}catch(Exception e){
		System.out.println("catch");
//getMessage(); ---> Gives only Description.
		System.out.println(e.getMessage());
	//toString(); ---> Gives Both  Description and Name of the error.	
		System.out.println(e.toString());
	}
	System.out.println("Hello");
	System.out.println("Main method Ended");

	}

}
