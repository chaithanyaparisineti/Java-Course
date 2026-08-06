package LoopingStatements;
import java.util.Scanner;
public class ReverseNumber {
static int reversenumber(int n) {
int rn=0;
int r=0;
while(n>0) {
	r=n%10;
	n=n/10;
	rn=rn*10+r;
}
return rn;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("main method started:");
	int n=sc.nextInt();
	int reversenumber=reversenumber(n);
	System.out.println("enter a number to print reverse number"+reversenumber);
	System.out.println("main method started:");
	}

}
