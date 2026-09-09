package oopsConcepts;

public class BusClass implements Vehicles{

	@Override
	public void start() {
	System.out.println("Bus has Started");	
	}

	@Override
	public void stop() {
	System.out.println("Bus has Stopped");	
	}

}
