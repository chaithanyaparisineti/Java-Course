package ExceptionHandling;
import java.util.Scanner;
class DuplicateUsernameException extends Exception{
	public DuplicateUsernameException (String message) {
		super(message);
	}
}
public class CustomUsername {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
        String[]existingusers= {"chaithanya","noor"};
        try {
        	String name=sc.nextLine();
        	for(String user:existingusers) {
        		if (name.equalsIgnoreCase(user)) {
        			throw new DuplicateUsernameException ("username is already exists");
        		}
        	}
        	System.out.println("Account has been created Successfully");
        }catch(DuplicateUsernameException e) {
        	System.err.println(e.getMessage());
        }  	
        }
	}


