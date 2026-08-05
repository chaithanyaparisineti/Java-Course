package LoopingStatements;
import java.util.Scanner;
public class SumOFdigits {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	int sum=0;
	int r=0;
	while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum+r;
	}
	System.out.println("sum of all the digits is:"+sum);
	sc.close();
	}

	}


