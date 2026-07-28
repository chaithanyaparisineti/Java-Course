package com.java;

public class primitivedatatypes {
	Integer empno=125;
	String empname="chaithanya";
	Double salary=5000d;
	Double bonus=10d;
	String hiredate="3/07/2026";
	Integer experience=2;
	{
		double num=salary/bonus;
		double num1=salary+bonus;
		double annualSalary=salary*12;
		double bonusamount=annualSalary*10/100;
		double TotalAmount=annualSalary+bonusamount;
		double fortwoyears=TotalAmount*2;
		System.out.println(num);
		System.out.println(num1);
		System.out.println(annualSalary);
		System.out.println(bonusamount);
		System.out.println(TotalAmount);
		System.out.println(fortwoyears);
	}
	public static void main(String[] args) {
		primitivedatatypes p1=new primitivedatatypes();
		System.out.println(p1.empno);
		System.out.println(p1.empname);
		System.out.println(p1.hiredate);
		System.out.println(p1.experience);
		


}
}