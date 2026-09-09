package oopsConcepts;

public class Vehicles2 {

	public static void main(String[] args) {
		Vehicles v1=new CarClass();
		v1.start();
		v1.stop();
		System.out.println("*********************");
		Vehicles v2=new BusClass();
		v2.start();
		v2.stop();
	}

}
