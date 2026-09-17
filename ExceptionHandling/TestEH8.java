package ExceptionHandling;

public class TestEH8 {
	public static void main(String[] args) {
		System.out.println("main method started");
		int age=19;
		try {
			if(age<18) {
				throw new ArithmeticException("Age must be 18 or above");
			}
			System.out.println("Eligible for vote");
		}
		catch(ArithmeticException e) {
			 System.out.println(e.getMessage());	
		}
		System.out.println("Mainmethod ended");
	}

}
