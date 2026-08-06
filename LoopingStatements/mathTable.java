package LoopingStatements;
import java.util.Scanner;
public class mathTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for math table:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			System.out.println(n + "X"+i +"="+(n*i));
		}

	}

}
