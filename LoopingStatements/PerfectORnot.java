package LoopingStatements;
import java.util.Scanner;
public class PerfectORnot {
	static boolean isperfect(int n) {
		boolean flag=false;
		int sum=0;
		if(n==1) {
			flag=true;
		}
		for(int i=1;i<=n/2;i++) {
            if (n % i == 0) {
                sum = sum + i;    
        }
		}
		  return sum == n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		boolean status=isperfect(n);
		if(status) {
			System.out.println("given number is perfect");
		}else {
			System.out.println("given number is not perfect");
		}
	}

}
