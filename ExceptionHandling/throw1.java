package ExceptionHandling;
import java.util.Scanner;
public class throw1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for a");
		int a=sc.nextInt();
		System.out.println("Enter number for b");
		int b=sc.nextInt();
		if(b!=0) {
		System.out.println(a/b);
		}else {
			throw new ArithmeticException("dont send zero");
		}
	}

}
