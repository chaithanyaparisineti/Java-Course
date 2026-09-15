package Weekendcases;
class Bus extends Vehicle {

	Bus(int VehicleNumber, String VehicleName, double price) {
		super(VehicleNumber, VehicleName, price);
	}
	 @Override
	    void start() {
	        System.out.println("Bus starts using a heavy-duty or key");
	    }

}
