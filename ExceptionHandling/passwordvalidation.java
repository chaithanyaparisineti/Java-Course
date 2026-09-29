package ExceptionHandling;

import java.util.Scanner;
class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String message) {
		super(message);
	}
}
public class passwordvalidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=sc.nextLine();
		
		try {
			if(password.length()<8) {
				throw new InvalidPasswordException("password must be 8 characters");
			}
			System.out.println("password Accepted");
		}catch(InvalidPasswordException e) {
			System.out.println("something went wrong try again");	
			System.err.println(e.getMessage());
		}
		sc.close();
	}

}
