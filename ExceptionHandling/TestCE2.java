package ExceptionHandling;

import java.io.File;
import java.io.IOException;
//WAP to create a file using throws into your local folders...?
public class TestCE2 {

	public static void main(String[] args)throws IOException {
		System.out.println("main method started");
		File f=new File("C:\\Users\\chaithanya\\workspaces\\corejavaworkspace\\chaithu1215.pdf");
		
			try {
				f.createNewFile();   //by Throws
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("main method ended");
	}

}
