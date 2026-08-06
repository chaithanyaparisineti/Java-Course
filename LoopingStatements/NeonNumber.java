package LoopingStatements;
import java.util.Scanner;
public class NeonNumber {
	static boolean isNeonNumber(int n) {
		boolean status=false;
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sum==n) {
			status=true;
		}
		return status;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	boolean status= isNeonNumber(n) ;
	if (status) {
		System.out.println("given number is Neon number");
	}else {
		System.out.println("given number is not Neon number");
	}

	}

}
