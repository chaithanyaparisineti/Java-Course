package oopsConcepts;
public class Abst3Animal {
	public static void main(String[] args) {
		System.out.println("******Dog Info********");
		AbstAnimal A1=new Abst2Dog();
		A1.eat();
		A1.walk();
		A1.sound();
		System.out.println("**********************");
	}

}
