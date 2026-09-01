package oopsConcepts;
class vehicle1{
	int speed =50;
	void display() {
		System.out.println("vehicle speed:"+speed);
	}
}
class car extends vehicle1{
	int speed =100;
	@Override
	void display() {
		System.out.println("car speed:"+speed);	
	}
}
public class VehicleParent {
	public static void main(String[] args) {
		vehicle1 v1=new vehicle1();
		v1.display();
     car c1=new car();
      c1.display();
	}
}
