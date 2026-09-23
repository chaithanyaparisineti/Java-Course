package ExceptionHandling;

import java.io.File;
import java.io.IOException;
//WAP to create a file using throws into your local folders...?
public class TestCE2 {

	public static void main(String[] args)throws IOException {
		System.out.println("main method started");
		File f=new File("C:\\Users\\chaithanya\\workspaces\\corejavaworkspace\\chaithu12.pdf");
		boolean status=f.createNewFile();
		if(status) {
			System.out.println("File has created successfully");
		}else {
			System.out.println("Something went wrong !");
		}
			System.out.println("main method ended");
	}

}
