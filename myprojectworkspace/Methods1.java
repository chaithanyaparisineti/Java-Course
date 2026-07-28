package myprojectworkspace;
import java.util.Scanner;

public class Methods1 {
		int SquareNumber(int num) {
		return num*num;
	}
	public static void main(String[] args) {
		Methods1 m1=new Methods1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int result=m1.SquareNumber(num);
		System.out.println("square of"+num+"="+result);
		}

}
