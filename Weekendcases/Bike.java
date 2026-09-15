package Weekendcases;

class Bike extends Vehicle{

	Bike(int VehicleNumber, String VehicleName, double price) {
		super(VehicleNumber, VehicleName, price);
	}
	 @Override
	    void start() {
	        System.out.println("Bike starts using a self-start or kick-start");
	    }

}
