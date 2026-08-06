package LoopingStatements;
import java.util.Scanner;
public class primeORnot {
static boolean isprime(int n) {
	boolean status=true;
	if(n==0||n==1) {
		status=false;
	}
	for(int i=2;i<n;i++) {
		if(n % i== 0) {
		status=false;
		break;
		}
	}
	return status;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		boolean flag=isprime(n);
		if(flag) {
			System.out.println("given number is prime number");
		}else {
			System.out.println("given number is not a prime");
		}

	}

}
