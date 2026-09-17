package ExceptionHandling;
//Try-catch-Finally
public class TestEH7 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			int a=10;
			int b=2;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithematic Error");
		}
		finally{
			System.out.println("Finally Block Executed");
		}
		System.out.println("Main method Ended");
	}

}
