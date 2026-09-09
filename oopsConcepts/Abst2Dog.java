package oopsConcepts;

public class Abst2Dog implements AbstAnimal{
	
	@Override
	public void sound() {
		System.out.println("Dog sounds like Bow Bow!!");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog mostly eats Non-veg");
	}
	
	@Override
	public void walk() {
		System.out.println("Dog can walks and also run");
	}
}
