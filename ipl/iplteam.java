package ipl;

public class iplteam {
	 int empId;
	 String empName;
	 int salary;
	 String department;
	
	public static void main(String[] args) {
		iplteam ip=new iplteam();
		
		ip.empName="chaithanya";
		ip.empId=15;
		ip.salary=12000;
		ip.department="employer";
		System.out.println(ip.empName);
		System.out.println(ip.empId);
		System.out.println(ip.salary);
		System.out.println(ip.department);
		
		iplteam ip2=new iplteam();
		ip2.empName="sravan";
		ip2.empId=17;
		ip2.salary=12000;
		ip2.department="employer2";
		System.out.println(ip2.empName);
		System.out.println(ip2.empId);
		System.out.println(ip2.salary);
		System.out.println(ip2.department);

	}
	
}
