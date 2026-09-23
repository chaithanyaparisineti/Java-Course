package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class TestCE4 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		try {
			FileInputStream fis=new FileInputStream("student.txt");
			System.out.println("file opened Successfully");
		}catch(FileNotFoundException e) {
			System.out.println("student.txt File not found ");	
			System.err.println(e.toString());
			}
//			catch(Exception e) {
//			System.out.println("Error occured:"+(e.getMessage()));
//		}
		System.out.println("Main Method Ended");
	}

}
