package myprojectworkspace;

public class Car {
	String brand;
	String model;
	float price;
	int carNo;
	Car(String brand,String model,Float price,int carNo){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.carNo=carNo;
	}
	Car(){
		
	}
	void display() {
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("price:"+price);
		System.out.println("*********************");
	}
	public static void main(String[] args) {
		Car c1=new Car("TATA","altroz",120000.00f,1215);
	     c1.display();
	     Car c2=new Car();
	     c2.display();

	}

}
