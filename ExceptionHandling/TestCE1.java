package ExceptionHandling;
import java.io.File;
import java.io.IOException;
//WAP to create a file using try-catch into your local folders...?
public class TestCE1 {
public static void main(String[] args) {
	System.out.println("main method started");
	File f=new File("C:\\Users\\chaithanya\\workspaces\\corejavaworkspace\\chaithu1215.txt");
	
		try {
			boolean status=f.createNewFile();//by using try-catch
			if(status) {
				System.out.println("File has created successfully");
			}else {
				System.out.println("Something went wrong !");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
