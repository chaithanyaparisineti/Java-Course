package oopsConcepts;

public class productAdding1 {
	private int pId;
	private String pName;
	private double price;
	private int quantity;
	
	public productAdding1( int pId,String pName,double price,int quantity) {
		this.pId=pId;
		this.pName=pName;
		this.price=price;
		this.quantity=quantity;
	}
	public void addItem(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
            System.out.println(quantity + " items added");
        } else {
            System.out.println("Quantity must be positive");
        }
    }

    public void removeItem(int quantity) {
        if (quantity > 0 && quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " items removed");
        } else {
            System.out.println("Cannot remove items. Quantity cannot be negative");
        }
    }
    public void display() {
    	    System.out.println("product Id:"+pId);
        System.out.println("product Name:"+pName);
        System.out.println("product price:"+price);
        System.out.println("product quantity:"+quantity);
    }
	
	public static void main(String[] args) {
		 productAdding1[] products = new productAdding1[5];
		 products[0] = new productAdding1(101, "Laptop", 50000, 10);
	     products[1] = new productAdding1(102, "Mobile", 20000, 15);
	     products[2] = new productAdding1(103, "Headphones", 2000, 20);
	     
	     System.out.println("Before Adding and Removing:");
	        products[0].display();
	        
	        products[0].addItem(5);
	        
	        products[0].removeItem(2);

	        System.out.println("After Adding and Removing:");
	        products[0].display();

	}

}
