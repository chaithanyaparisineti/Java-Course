package oopsConcepts;

  class vehicle1 {
	  void start() {
		  System.out.println("vehicle is Starting");
	  }
  }
  class car extends vehicle1{
	  void drive() {
		  System.out.println("car is driving");
	  }
  }
  public class vehicle{
	public static void main(String[] args) {
		car c=new car();
		c.start();
		c.drive();
	
	}

}
