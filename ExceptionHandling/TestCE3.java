package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCE3 {
	//WAP to read data from the file and print in console..?
	 public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method started");
		File f=new File("C:\\Users\\chaithanya\\workspaces\\corejavaworkspace\\chaithu1215.txt");
		FileReader fr=new FileReader(f);
		 int i=fr.read();
		 while(i!=-1) {
			 System.out.print((char)i);
//			 Thread.sleep(5);
			 i=fr.read();
		 }
		 fr.close();
		 System.out.println("\nmain method ended");
	}

}
