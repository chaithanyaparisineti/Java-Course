package LoopingStatements;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(n1 + " ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
