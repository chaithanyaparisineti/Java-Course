package oopsConcepts;

public class customer2 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setcusId(1215);
		c1.setcName("chaithanya");
		c1.setcphno("8125200535");
		c1.setEmail("chaithanyaparisineti@gmail.com");

        System.out.println("Customer ID: " + c1.getcusId());
        System.out.println("Name: " + c1.getcName());
        System.out.println("Phone Number: " + c1.getcphno());
        System.out.println("Email: " + c1.getEmail());

    }
	}


