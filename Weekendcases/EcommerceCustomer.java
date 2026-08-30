package Weekendcases;
class customer{
	private String name;
	private String email;
	private double accountbalance;
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getemail() {
		return email;
	}
	public void setaccountbalance(double accountbalance) {
		if(accountbalance>=0) {
			this.accountbalance=accountbalance;
		}else {
			System.out.println("Account balance cannot be negative");
		}
	}
	public double getaccountbalance() {
		return accountbalance;
	}
}
public class EcommerceCustomer {

	public static void main(String[] args) {
		customer c1=new customer();
		
		c1.setname("chaithanya");
		c1.setemail("chaithanyaparisineti@gmail.com");
		c1.setaccountbalance(50000.00);
		
		System.out.println("\n******customer details******");
		System.out.println("Name: " +c1.getname());
        System.out.println("Email: " + c1.getemail());
        System.out.println("Account Balance: " 
                           + c1.getaccountbalance());
	}

}
