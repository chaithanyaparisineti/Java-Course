package ExceptionHandling;
import java.util.Scanner;
//Invalid numeric input using Scanner..?
public class TestEH3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main method Ended");
		try {
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		System.out.println("Number:"+num);
		}catch(Exception e) {
			System.out.println("invalid input please enter the Number");
		}
		System.out.println("Main method Ended");
		sc.close();
	}
}
