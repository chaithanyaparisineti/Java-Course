package oopsConcepts;
//A shallow copy creates a new object, but the referenced objects inside it are not copied.
//Both the original and copied objects refer to the same nested objects.

	class student implements Cloneable{
		int sid;
		String sname;
		Address address;
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			
			return super.clone();
		}

		public student(int sid, String sname, Address address) {
			this.sid = sid;
			this.sname = sname;
			this.address = address;
		}	
	}
	class Address{
		String city;

		public Address(String city) {
			this.city = city;
		}
	}
		public class ShallowCopy {
	public static void main(String[] args) throws CloneNotSupportedException{
		System.out.println("main method started");
		Address address = new Address("hyderabad");
		student s1 = new student(12,"chaithanya", address);
        System.out.println(s1.sid);
        System.out.println(s1.sname);
        System.out.println(s1.address.city);
       System.out.println("************************************************");
        student s2=(student)s1.clone();
        System.out.println(s2.sid);
        System.out.println(s2.sname);
        System.out.println(s2.address.city);
	       
	    }
	}
	


