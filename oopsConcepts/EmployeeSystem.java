package oopsConcepts;
class employee{
	//overload-1
double calculateSalary(){
	return 30000;	
}
//overload-2
double calculateSalary(double bonus) {
	return 30000+bonus;	
}
}
class Developer extends employee{
	@Override
	double calculateSalary(){
		return 50000;	
	}
	@Override
	double calculateSalary(double bonus) {
		return 50000+bonus;
	}
}
public class EmployeeSystem {
	public static void main(String[] args) {
		employee e1=new employee();
		Developer D1=new Developer();
System.out.println("calculated Salary :"+e1.calculateSalary());
System.out.println("calculated Salary :"+e1.calculateSalary(20000));
System.out.println("***********************************");
System.out.println("calculated Salary :"+D1.calculateSalary());
System.out.println("calculated Salary :"+D1.calculateSalary(10000));
	}

}
