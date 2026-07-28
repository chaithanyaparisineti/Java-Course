package myprojectworkspace;
import java.util.Scanner;
public class ValidTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a side:");
		int a=sc.nextInt();
		System.out.println("enter b side:");
		int b=sc.nextInt();
		System.out.println("enter c side:");
		int c=sc.nextInt();
		if ((a+b>c)&&(a+c>b)&&(b+c>a)){
			System.out.println("valid triangle");
		}
			else {
				System.out.println("invalid triangle");
			}
		}



	}


