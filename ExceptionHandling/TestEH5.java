package ExceptionHandling;
//Null pointer Exception..?
public class TestEH5 {
	public static void main(String[] args) {
		 String name= null;
		 System.out.println("Main method Started");
		 try {
			 System.out.println(name.length());
		 }catch(NullPointerException e) {
			 System.out.println("String value is null");
		 }
		 System.out.println("Main method Ended");
	}

}
