package com.Multithreading;
class Employee extends Thread{
	String EmployeeName;
	int Id;
	int age;
	double Salary;
	long MobileNo;
	public Employee(String employeeName, int id, int age, double salary, long mobileNo) {
	    this.EmployeeName = employeeName;
		this.Id = id;
		this.age = age;
		this.Salary = salary;
		this.MobileNo = mobileNo;
	}
	@Override
	public void run() {
		System.out.println("EmployeeName:"+EmployeeName+
				",Id:"+Id+
				",age:"+age+
				",Salary:"+Salary+
				",MobileNo:"+MobileNo
				);
	}
	
}
public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e1=new Employee("chaithanya", 1215, 22, 50000, 8125200535L);
		Employee e2=new Employee("sai", 18, 22, 40000, 8125200535L);
		Employee e3=new Employee("ram", 15, 21, 45000, 8125200535L);
		
		e1.start();
		e2.start();
		e3.start();

	}

}
