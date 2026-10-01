package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class deserilization {

    public static void main(String[] args) throws Exception {

        System.out.println("Main method Started");

        File f = new File("C:\\Users\\Public\\Documents\\Employee.txt");

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee obj = (Employee) ois.readObject();

        System.out.println("Object deserialized successfully");
        System.out.println("Name: " + obj.name);
        System.out.println("Course: " + obj.course);

        System.out.println("Main method Ended");
    }
}