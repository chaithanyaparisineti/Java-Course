package oopsConcepts;
class Employee12{
	double calculateSalary() {
		return 40000;
	}
}
class developer extends Employee12{
	@Override
	double calculateSalary() {
		return 55000;
	}
}
class Tester extends Employee12{
	@Override
	double calculateSalary() {
		return 50000;
	}
}
class Manager extends Employee12{
	@Override
	double calculateSalary() {
		return 70000;
	}
}
public class Employees {
	public static void main(String[] args) {
	Employee12 E1=new Employee12();
	developer d1=new developer();
	Tester t1=new Tester();
	Manager M1=new Manager();
	
	System.out.println("Employee12 salary:"+E1.calculateSalary());
	System.out.println("Developer salary:"+d1.calculateSalary());
	System.out.println("Tester salary:"+t1.calculateSalary());
	System.out.println("Manager salary:"+M1.calculateSalary());


	}

}
