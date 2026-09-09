package oopsConcepts;

public class CarClass implements Vehicles {

	@Override
	public void start() {
		System.out.println("car has Started");	
	}
	@Override
	public void stop() {
		System.out.println("car has stopped");
	}

}
