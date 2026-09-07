package Weekendcases;
class product {

    int pId;
    String pName;
    double price;

    product(int pId, String pName, double price) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
    }

    void displayproduct() {
        System.out.println("Product ID: " + pId);
        System.out.println("Product Name: " + pName);
        System.out.println("Price: " + price);
    }
}

class Electronics extends product {

    int warrantyperiod;

    Electronics(int pId, String pName, double price, int warrantyperiod) {
        super(pId, pName, price);
        this.warrantyperiod = warrantyperiod;
    }

    void displayElectronics() {
        displayproduct();
        System.out.println("Warranty: " + warrantyperiod + " years");
    }
}

class clothing extends product {

    String size;
    String material;

    clothing(int pId, String pName, double price, String size, String material) {
        super(pId, pName, price);
        this.size = size;
        this.material = material;
    }

    void displayclothing() {
        displayproduct();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

class Book extends product {

    String author;
    String publisher;

    Book(int pId, String pName, double price, String author, String publisher) {
        super(pId, pName, price);
        this.author = author;
        this.publisher = publisher;
    }

    void displayBook() {
        displayproduct();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}

public class onlineShopping {
	public static void main(String[] args) {
		Electronics e = new Electronics(101, "Laptop", 55000, 2);

        clothing c = new clothing(102, "T-Shirt", 999, "L", "Cotton");

        Book b = new Book(103, "Java Programming", 599, "James Gosling", "Oracle Press");

        System.out.println("***electronics***");
        e.displayElectronics();

        System.out.println("\n***clothing***");
        c.displayclothing();

        System.out.println("\n***Book***");
        b.displayBook();
    }
}