package ExceptionHandling;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class AgeValidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new InvalidAgeException("Age must be 18 or above");
			}
			System.out.println("Registration Successfully completed");
		}catch( InvalidAgeException e) {
			System.out.println("something went wrong tryagain");	
			System.err.println(e.getMessage());
		}
		sc.close();
	}

}
