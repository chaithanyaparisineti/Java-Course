package oopsConcepts;

class students{
	int sId;
	String Sname;
	Address12 address;
	
	public students(int sId,String Sname,Address12 address) {
		this.sId=sId;
		this.Sname=Sname;
		this.address=address;
	}
	public students(students st1) {
		this.sId=st1.sId;
		this.Sname=st1.Sname;
		this.address=st1.address;
	}
}
class Address12{
	String city;
	
	public Address12(String city) {
		this.city=city;
	}
	public Address12(Address12 address) {
		this.city=address.city;
	}
}
public class StudentDeepcopy {

	public static void main(String[] args) {
		Address12 a1=new Address12("hyderabad");
	students st1=new students(101,"chaithanya",a1);
	
	students st2=new students(st1);
	
	System.out.println("Student ID:"+st1.sId);
	System.out.println("Student Name:"+st1.Sname);
	System.out.println("city:"+st1.address.city);
	System.out.println("***********************************");
	System.out.println("Student ID:"+st2.sId);
	System.out.println("Student Name:"+st2.Sname);
	System.out.println("city:"+st2.address.city);
	System.out.println("***********************************");
	 System.out.println("\nAfter changing copied student city:");
    st2.address.city = "Gudur";
	System.out.println("Studet Id:"+st2.sId);
	System.out.println("Student Name:"+st2.Sname);
	System.out.println("city:"+st2.address.city);

	
	}

}
