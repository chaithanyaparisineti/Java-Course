package oopsConcepts;
//A shallow copy creates a new object, but the referenced objects inside it are not copied.
//Both the original and copied objects refer to the same nested objects.

//Student class
class Student implements Cloneable {

 int sid;
 String sname;
 Address address;

 // Constructor
 public Student(int sid, String sname, Address address) {
     this.sid = sid;
     this.sname = sname;
     this.address = address;
 }

 // clone() method
 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone();
 }
}

//Address class
class Address {

 String city;

 // Constructor
 public Address(String city) {
     this.city = city;
 }
}

//Main class
public class ShallowCopy {

 public static void main(String[] args) throws CloneNotSupportedException {

     System.out.println("main method started");

     // Creating Address object
     Address address = new Address("Hyderabad");

     // Creating original Student object
     Student s1 = new Student(12, "Chaithanya", address);

     System.out.println("Original Student:");
     System.out.println("Student ID: " + s1.sid);
     System.out.println("Student Name: " + s1.sname);
     System.out.println("City: " + s1.address.city);

     System.out.println("************************************");

     // Creating shallow copy
     Student s2 = (Student) s1.clone();

     System.out.println("Copied Student:");
     System.out.println("Student ID: " + s2.sid);
     System.out.println("Student Name: " + s2.sname);
     System.out.println("City: " + s2.address.city);

     System.out.println("************************************");

     // Changing Address using copied object
     s2.address.city = "Bangalore";

     System.out.println("After changing s2 address:");

     System.out.println("s1 city: " + s1.address.city);
     System.out.println("s2 city: " + s2.address.city);
 }
}