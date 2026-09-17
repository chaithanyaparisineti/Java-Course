package ExceptionHandling;
//Multiple catch blocks...?
public class TestEH2 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
		int[]arr= {10,20,30};
		System.out.println(arr[5]);
		int result=10/0;
		System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index is invalid");
     	}catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
     	}catch(Exception e) {
		System.out.println("some other exception occured");
	}
	System.out.println("Main method ended");
	}

}
