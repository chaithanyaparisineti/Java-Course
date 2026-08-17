package LoopingStatements;
import java.util.Scanner;
public class FactorialOFnumber {
	public static long findfactorial(long n) {
		long fact=1;
		for(long i=n;i>=1;i--) {
		fact=fact*i;	
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		long n=sc.nextLong();
		long fact=findfactorial(n);
		System.out.println("factorial of given number:"+fact);
	}
}
