package myprojectworkspace;

public class Book {
	String Tittle;
	int BookId;
	String Author;
	Book(String Tittle,int BookId,String Author){
		this.Tittle=Tittle;
		this.BookId=BookId;
		this.Author=Author;	
	}
	Book( String Tittle,Book b1,String Author){
		this.Tittle=Tittle;
		this.BookId=b1.BookId;
		this.Author=Author;
	}
		
	void display() {
		System.out.println("Tittle:"+Tittle);
		System.out.println("BookId:"+BookId);
		System.out.println("Author:"+Author);
		System.out.println("*******************************");
	}
	

	public static void main(String[] args) {
		Book b1=new Book("metamorphasis",1215,"Noor");
		b1.display();
		Book b2=new Book("king",b1,"Ram");
		b2.display();

	}

}
