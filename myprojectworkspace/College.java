package myprojectworkspace;

public class College {
	String collegeName;
	String city;
	int Numberofstudents;
	College(){
		this("NBKRIST");
		System.out.println("no arg constructor called");
	}
	College(String collegeName){
		this(collegeName,"vidyanagar");
		System.out.println("one arg constructor called");
	}
	College(String collegeName,String city){
	this(collegeName,city,2000);
	}
	College(String collegeName,String city,int Numberofstudents){
		this.collegeName=collegeName;
		this.city=city;
		this. Numberofstudents= Numberofstudents;
	}
	
	void display() {
		System.out.println("collegeName:"+collegeName);
		System.out.println("city:"+city);
		System.out.println("Numberofstudents:"+Numberofstudents);
		System.out.println("*************************************");
	}
	public static void main(String[] args) {
			College c1=new College();
			c1.display();
			}
		
		
	}


