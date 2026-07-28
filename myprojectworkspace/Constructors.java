package myprojectworkspace;

public class Constructors {
	int studentid;
	String eName;
	Constructors(int id,String eName){
	this.studentid=id;
	this.eName=eName;
	}
		Constructors(){
	}
	void show(){
		System.out.println("studentid:"+studentid);
		System.out.println("eName:"+eName);
	}
	public static void main(String[] args) {
		Constructors c1=new Constructors(12,"chaithanya");
		c1.show();

	}

}
