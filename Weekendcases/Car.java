package Weekendcases;
class Car extends Vehicle {

	Car(int VehicleNumber, String VehicleName, double price) {
		super(VehicleNumber, VehicleName, price);	
	}
	@Override
	void start() {
		System.out.println("car starts using a key or by using self start button");
	}

}
