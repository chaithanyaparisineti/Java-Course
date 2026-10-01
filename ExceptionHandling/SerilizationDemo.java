package ExceptionHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    String name = "chaithanya";
    String course = "java full stack";
}

public class SerilizationDemo {
    public static void main(String[] args) throws IOException {
    	System.out.println("main method Started");

        Employee emp = new Employee();

        File f = new File("C:\\Users\\Public\\Documents\\Employee.txt");

        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(emp);      
        System.out.println("Object serialized successfully");
        System.out.println("main method Started");
    }
}