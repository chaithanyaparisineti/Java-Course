package Weekendcases;
public class VehicleManagement {
	public static void main(String[] args) {
		Vehicle c1=new Car(15,"Altroz",120000);
		Vehicle b1=new Bike(12,"Royal Enfield",100000);
		Vehicle b2=new Bus(1215,"Volvo",120000);
		System.out.println("*****CAR*****");
		c1.displayDetails();
		c1.start();	
		
		System.out.println("*****BIKE*****");
		b1.displayDetails();
		b1.start();	
		
		System.out.println("*****BUS*****");
		b2.displayDetails();
		b2.start();	
	}

}
