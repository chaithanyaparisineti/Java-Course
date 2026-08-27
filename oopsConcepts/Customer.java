package oopsConcepts;

public class Customer {
	private int cusId;
	private String cName;
	private String cphno;
	private String email;
	public void setcusId(int cusId) {
		this.cusId=cusId;
	}
	public void setcName(String cName) {
		if(cName.length()>0) {
			this.cName=cName;
		}else {
			System.out.println("Name cannot be Empty");
		}	
	}
	public void setcphno(String cphno) {
		if(cphno.length()==10) {
			this.cphno=cphno;
		}else {
			System.out.println("phone number must contins 10 digits");
		}
	}
	public void setEmail(String Email) {
		if(Email.contains("@")) {
		this.email=Email;
		}else {
			System.out.println("email id must contains @ ");
		}
	}
	public int getcusId() {
		return cusId;
	}
	public String getcName() {
		return cName;
	}
	public String getcphno() {
		return cphno;
	}
	public String getEmail() {
		return email;
	}
	

}
