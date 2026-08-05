package LoopingStatements;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int number=num;
	 while(num!=0) {
		 int n=num%10;
		 int fact=1;
		 for(int i=1;i<=n;i++) {
			 fact=fact*i;
		 }
		 sum=sum+fact;
		 num=num/10;
	 }
	 if(sum==number) {
		 System.out.println("it is a Strong number");
	 }else {
		 System.out.println("it is not a Strong number");
	 }
	}

}
