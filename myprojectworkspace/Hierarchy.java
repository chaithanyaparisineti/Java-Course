package myprojectworkspace;
class Animal{
	Animal(){
		this("lion");
		System.out.println("no arg constructor called");
		
	}
	Animal(String AnimalName){
		System.out.println("one arg constructor called");
	}
}
class Mammal extends Animal{
	Mammal(){
		this("dog");
		System.out.println("Mammal no arg constructor called");		
}

	Mammal(String name1){
		super();
		System.out.println("Mammal one arg construvtor called");
	}

	Mammal(String name1,String Name2){
		this();
		System.out.println("Mammal two arg construvtor called");
	}
}
	class Dog extends Mammal{
		Dog(){
			
			System.out.println("Dog no arg constructor");
		}
		Dog(String Breed){
			super("dog","cat");
			System.out.println("Dog one arg constructor");
		}
	}

public class Hierarchy {

	public static void main(String[] args) {
		Dog d1= new Dog();
	}

	}



