package Weekendcases;
abstract class Vehicle {
	int vehicleNumber;
	String VehicleName;
	double price;
	
	Vehicle(int VehicleNumber,String VehicleName,double price){
		this.vehicleNumber=VehicleNumber;
		this.VehicleName=VehicleName;
		this.price=price;
	}
 void displayDetails() {
		System.out.println("Vehicle Number:"+vehicleNumber);
		System.out.println("Vehicle Name:"+VehicleName);
		System.out.println("price:"+price);
	}
	abstract void start();

}
