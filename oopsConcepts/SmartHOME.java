package oopsConcepts;
public class SmartHOME {
	public static void main(String[] args) {
	SmartDevice s1=new SmartLight(12,"tube light");
	SmartDevice s2=new SmartFan(15,"usha Fan");
	SmartDevice s3=new SmartAC(1215,"SAMSUNG");
	
	System.out.println("----SMART LIGHT----");
	s1.display();
	s1.turnon();
	//s1.turnoff();
	System.out.println("*********************************");
	System.out.println("----SMART FAN----");
	s2.display();
	//s2.turnon();
	s2.turnoff();
	System.out.println("*********************************");
	System.out.println("----SMART AC----");
	s3.display();
	s3.turnon();
	//s3.turnoff();
	System.out.println("*********************************");
	}

}
