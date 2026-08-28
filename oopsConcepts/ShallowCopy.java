package oopsConcepts;

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
		Address address = new Address("Hyderabad");
		student s1 = new student(12,"chaithanya", address);
        System.out.println(s1.sid);
        System.out.println(s1.sname);
        System.out.println(s1.address.city);
        
        student s2=(student)s1.clone();
        System.out.println(s2.sid);
        System.out.println(s2.sname);
        System.out.println(s2.address.city);
	       
	    }
	}
	


