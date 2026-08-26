package oopsConcepts;

public class Encapsulation {

	public static void main(String[] args) {
		  Employee E1 = new Employee();

	        E1.setEid(1215);
	        E1.setEname("chaithanya");
	        E1.setSalary(50000.00);

	        System.out.println(E1.geteid());
	        System.out.println(E1.getename());
	        System.out.println(E1.getSalary());
	}

}
