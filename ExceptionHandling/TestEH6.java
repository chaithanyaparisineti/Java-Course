package ExceptionHandling;

public class TestEH6 {
	//NumberFormatException
	public static void main(String[] args) {
		String value="123abc";
		System.out.println("main method started");
		try {
			int number=Integer.parseInt(value);
			System.out.println(number);
		}catch(NumberFormatException e) {
			System.out.println("Invalid number Format");
		}
       System.out.println("main method ended");
	}

}
