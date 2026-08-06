package LoopingStatements;
import java.util.Scanner;
public class HappyNumber {
static boolean isHappyNumber(int n){
	while(n!=1&&n!=4) {
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum += digit * digit;
			n=n/10;
		}
		n=sum;
	}	
	return n==1;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(isHappyNumber(n)) {
			System.out.println("given number is a Happy Number");
		}else {
			System.out.println("given number is not a Happy Number");
		}

	}

}
