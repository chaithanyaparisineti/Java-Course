package myprojectworkspace;
import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A marks:");
		int A=sc.nextInt();
		System.out.println("enter B marks:");
		int B=sc.nextInt();
		System.out.println("enter C marks:");
		int C=sc.nextInt();
		System.out.println("enter D marks:");
		int D=sc.nextInt();
		System.out.println("enter E marks:");
		int E=sc.nextInt();
		int total=A+B+C+D+E;
		double percentage=total/5.0;
		System.out.println("total marks="+total);
		System.out.println("percentage="+percentage);
		if (percentage>=90) {
			System.out.println("Grade:A");
		}
			else if(percentage>=75) {
				System.out.println("Grade:B");
			}
			else if(percentage>=60) {
				System.out.println("Grade:C");
			}
			else if(percentage>=40) {
				System.out.println("Grade:D");
			}
			else if(percentage<40) {
				System.out.println("Grade:E");
			}
		}
		
		

		

	}


