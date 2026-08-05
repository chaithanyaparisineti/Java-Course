package LoopingStatements;
import java.util.Scanner;
public class Range {
int num;
static int count;
int n;
static Scanner sc=new Scanner(System.in);
void evennumber(int num) {
	count=0;
	for(int i=1;i<num;i++) {
		if(i%2==0) {
			if(count<n) {
			System.out.println(i+" ");		
			}
			count++;
		}	
		}
}
	public static void main(String[] args) {
		 Range en=new Range();
		System.out.println("enter range:");
		 en.n=sc.nextInt();
		System.out.println("enter number:");
		 en.num=sc.nextInt();
		 en.evennumber(en.num);
	}
}

