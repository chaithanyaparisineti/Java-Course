package oopsConcepts;
class Animal{
	void Animalinfo() {
		System.out.println("Animal method started");
	}
	void sound() {
		System.out.println("Every animal makes sounds");
	}
}
class Dog extends Animal{
	void Doginfo() {
		System.out.println("dog method started");
	}
	void sound() {
		System.out.println("Dog barks like Bow Bow");
	}
}
class BabyDog extends Dog{
	void BabyDoginfo() {
		System.out.println("Babydog method started");
	}
	void sound() {
		System.out.println("Baby Dog Sounds like Buu Buu");
	}
}
public class TestInheritance1 {

	public static void main(String[] args) {
		BabyDog b1=new BabyDog();
		b1.Animalinfo();
		b1.Doginfo();
		b1.BabyDoginfo();
		b1.sound();
		System.out.println(b1.hashCode());
	}

}
