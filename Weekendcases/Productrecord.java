package Weekendcases;

public class Productrecord {
	int ProductId;
	String ProductName;
	String Brand;
	Double Price;
	int Warranty;
	Productrecord(int ProductId,String ProductName,String Brand,Double Price,int Warranty){
		this.ProductId=ProductId;
		this.ProductName=ProductName;
		this.Brand=Brand;
		this.Price=Price;
		this.Warranty=Warranty;
	}
	Productrecord(Productrecord P1){
		this.ProductId=P1.ProductId;
		this.ProductName=P1.ProductName;
		this.Brand=P1.Brand;
		this.Price=P1.Price;
		this.Warranty=P1.Warranty;
	}
	
	void display() {
		System.out.println("ProductId:"+ProductId);
		System.out.println("ProductName:"+ProductName);
		System.out.println("Brand:"+Brand);
		System.out.println("Price:"+Price);
		System.out.println("Warranty:"+Warranty+"years");
		System.out.println("*******************************");
		
	}

	public static void main(String[] args) {
		Productrecord P1=new Productrecord(1215,"laptop","samsung",50000d,2);
		System.out.println("original details of product");
		P1.display();
		Productrecord P2=new Productrecord(1215,"laptop","samsung",50000d,2);
		System.out.println("original details of product");
		P2.display();
	}

}
