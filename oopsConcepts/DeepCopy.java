package oopsConcepts;
//A deep copy creates a new object and also creates new copies of all referenced objects inside it.
//Changes to the copied object do not affect the original object.

class student1 {

    int sid;
    String sname;
    Address1 address;

    // Normal constructor
    public student1(int sid, String sname, Address1 address) {
        this.sid = sid;
        this.sname = sname;
        this.address = address;
    }

    // Copy constructor for Deep Copy
    public student1(student1 st1) {
        this.sid = st1.sid;
        this.sname = st1.sname;
        this.address = new Address1(st1.address);
    }
}

class Address1 {

    String city;

    // Normal constructor
    public Address1(String city) {
        this.city = city;
    }

    // Copy constructor
    public Address1(Address1 address) {
        this.city = address.city;
    }
}

public class DeepCopy {

    public static void main(String[] args) {

        Address1 a1 = new Address1("Nellore");

        student1 st1 = new student1(101, "Chaithanya", a1);

        // Deep copy
        student1 st2 = new student1(st1);

        System.out.println("Original Student:");
        System.out.println("ID: " + st1.sid);
        System.out.println("Name: " + st1.sname);
        System.out.println("City: " + st1.address.city);

        System.out.println("\nCopied Student:");
        System.out.println("ID: " + st2.sid);
        System.out.println("Name: " + st2.sname);
        System.out.println("City: " + st2.address.city);

        // Change copied objects city
        st2.address.city = "Gudur";

        System.out.println("\nAfter changing copied student city:");

        System.out.println("Original City: " + st1.address.city);
        System.out.println("\nCopied Student:");
        System.out.println("ID: " + st2.sid);
        System.out.println("Name: " + st2.sname);
        System.out.println("City: " + st2.address.city);
        System.out.println("Copied City: " + st2.address.city);
    }
}