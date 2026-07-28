package myprojectworkspace;

public class Constructors2 {
	int rollNo;
	String eName;
	String collageName;
	double fee;
	long phoneNo;
	float cgpa;
	String Branch;
	Constructors2(int rollNo,String eName,String collageName,double fee,long phoneNo,float cgpa,String Branch){
		this.rollNo=rollNo;
		this.eName=eName;
		this.collageName=collageName;
		this.fee=fee;
		this.phoneNo=phoneNo;
		this.cgpa=cgpa;
		this.Branch=Branch;
	}
	Constructors2(){
		
	}
	void display() {
		System.out.println("rollNo:"+rollNo);
		System.out.println("eName:"+eName);
		System.out.println("collageName:"+collageName);
		System.out.println("fee:"+fee);
		System.out.println("phoneNo:"+phoneNo);
		System.out.println("cgpa:"+cgpa);
		System.out.println("Branch:"+Branch);
		
	}

	public static void main(String[] args) {
		Constructors2 c1=new Constructors2(15,"chaithanya","NBKRIST",25000.00d,8125200535L,7.5f,"ECE");
		c1.display();

	}

}
