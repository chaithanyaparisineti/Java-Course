package oopsConcepts;
 class vehicles{
	 void start() {
		 System.out.println("vehicles are Starting");
	 }
 }
 class cars extends vehicles{
	@Override
	 void start() {
		 System.out.println("cars are starting");
	 }
void drive() {
	System.out.println("cars are moving");
}
}
 public class PandCreference{
	 public static void main (String[]args) {
		 cars c =new cars();
		 c.start();
		 c.drive();
		 vehicles v =new vehicles();
		 v.start();
		 
	 }
 }